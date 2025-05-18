# Flyweight design pattern
Imagine a scenario where certain instances are repeatedly used by many instances 
of another type. For example, a Text Editor program creates multiple `Character` instances, 
each of which contains `CharacterFormat` as its instance field.

```
public class CharacterFormat {
    private final String font;
    private final int size;
    private final boolean bold;
    private final boolean italic;
    private final boolean underlined;
    
    // Constructors, getters and setters
}

public class Character {
    private final char character;
    private final int position;
    private final CharacterFormat format;
    
    // Constructors, getters and setters
}
```

Now, suppose that a `CharacterFormat` object of "Times New Roman", with a size of 12, and bold style
is used by different `CharacterFormat` objects as shown:


```
public class TextEditor {
    public static void main(String[] args) {
        String text = "Sweet Potato contains lots of phytonutrients."
        List<Character> document = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            document.add(new Character(text.charAt(i), i, new CharacterFormat("Times New Roman", 12, true)); 
        }
    }
}
```

Intuitively, a cached instance of the particular `CharacterFormat` should be managed. 
Since character formats are usually determined at runtime and can possibly vary
at a vast range, it is not a good idea to pre-populate variations of `CharacterFormat` 
as static variables. That's when the Flyweight pattern kicks in.


```
public class CharacterFormatFactory {
    private final Map<CharacterFormat, CharacterFormat> formats = new HashMap<>();

    public CharacterFormat getFormat(String font, int size, boolean bold, boolean italic, boolean underlined) {
        CharacterFormat format = new CharacterFormat(font, size, bold, italic, underlined);
        return formats.computeIfAbsent(format, k -> format);
    }
}
```

The `CharacterFormatFactory` act as the *Flyweight Factory*, whose role is to cache repeated
instances of `CharacterFormat` and provide them when asked for. Imagine there are one million
`Characters`'s sitting in the memory heap, half of them share the same `CharacterFormat`.
Enormous spaces are saved with this design as shown below.


```
public class TextEditor {
    public static void main(String[] args) {
        String text = "Sweet Potato contains lots of phytonutrients.";
        CharacterFormatFactory factory = new CharacterFormatFactory();
        List<Character> document = new ArrayList<>();
        CharacterFormat format;
        
        for (int i = 0; i < text.length(); i++) {
            if (i < text.length() / 2) {
                format = factory.getFormat("Times New Roman", 12, false, false, false);
            }
            else {
                format = factory.getFormat("Calibri", 12, false, false, false);
            }
            document.add(new Character(text.charAt(i), i, format); 
        }
    }
}
```

### Definitions
*Concrete Flyweight* = `CharacterFormat` (The shared/intrinsic data)  
*Context* = `Character` (The unique/extrinsic data)  
*Flyweight Factory* = `CharactorFormatFactory`  
*Client* = `TextEditor`  

That is all the basics of *Flyweight design pattern*. However, in the `com.satsumaimo.structural.flyweight` package,
a concurrent situation of multi-threads racing for `CharacterFormatFactory`'s caching map - `formats` - 
is demonstrated.

```
CharacterFormat format1 = new CharacterFormat("Arial", 12, false, false);


Thread 1 -------access------+
                            |
                            |
Thread 2 -------access------+------> formats (caching map): formats.computeIfAbsent(format, k -> format)
                            |
                            |
Thread 3 -------access------+

```

If not careful, a key-value entry could be mistakenly inserted more than once as it is absent in a thread, but actually *exists* in 
another thread just immediately after `formats.computeIfAbsent(format, k -> format)` operation. Try running `TextEditor.main` several times to
see the result like:

```
formatFactory.getFormatsSize() = 3 // Or 4, 5, ...
// formatFactory.getFormatsSize() = 2 is expected
```
To solve this, a concurrent map is used to guarantee thread-safety.
```
public class CharacterFormatFactory {
//    private final Map<CharacterFormat, CharacterFormat> formats = new HashMap<>(); // Not thread-safe

    private final Map<CharacterFormat, CharacterFormat> formats = new ConcurrentHashMap<>();
    
    ...
    
}
```




