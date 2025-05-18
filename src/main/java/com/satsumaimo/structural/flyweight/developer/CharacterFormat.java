package com.satsumaimo.structural.flyweight.developer;

import java.util.Objects;

/**
 * Flyweight class: shared character formatting
 */
public class CharacterFormat {
    private final String font;
    private final int size;
    private final boolean bold;
    private final boolean italic;

    public CharacterFormat(String font, int size, boolean bold, boolean italic) {
        this.font = font;
        this.size = size;
        this.bold = bold;
        this.italic = italic;
    }

    public String toString() {
        String style = "";
        if (bold) style += "Bold ";
        if (italic) style += "Italic";
        if (style.isEmpty()) style = "Regular";
        return "{ font: " + font + ", size: " + size + "pt, style: " + style.trim() + " }";
    }

    // equals() and hashCode() are important for map keys in the factory
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CharacterFormat)) return false;
        CharacterFormat that = (CharacterFormat) o;
        return size == that.size && bold == that.bold && italic == that.italic && font.equals(that.font);
    }

    @Override
    public int hashCode() {
        return Objects.hash(font, size, bold, italic);
    }
}
