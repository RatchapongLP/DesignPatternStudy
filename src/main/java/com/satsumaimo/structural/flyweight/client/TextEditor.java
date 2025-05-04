package com.satsumaimo.structural.flyweight.client;

import com.satsumaimo.structural.flyweight.developer.Character;
import com.satsumaimo.structural.flyweight.developer.CharacterFormat;
import com.satsumaimo.structural.flyweight.developer.CharacterFormatFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Main class to demonstrate usage
 */
public class TextEditor {
    public static void main(String[] args) {
        List<Character> document = new ArrayList<>();
        CharacterFormatFactory formatFactory = new CharacterFormatFactory();

        CharacterFormat regularFormat = formatFactory.getFormat("Arial", 12, false, false);
        String text = "Hello world";

        for (int i = 0; i < text.length(); i++) {
            document.add(new Character(text.charAt(i), i, regularFormat));
        }

        CharacterFormat boldItalicFormat = formatFactory.getFormat("Arial", 12, true, true);
        document.add(new Character('!', text.length(), boldItalicFormat));

        for (Character c : document) {
            c.display();
        }
    }
}
