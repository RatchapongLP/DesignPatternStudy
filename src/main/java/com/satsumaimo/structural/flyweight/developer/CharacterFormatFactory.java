package com.satsumaimo.structural.flyweight.developer;

import java.util.HashMap;
import java.util.Map;

/**
 * Flyweight Factory: creates and reuses formatting instances
 */
public class CharacterFormatFactory {
    private final Map<CharacterFormat, CharacterFormat> formats = new HashMap<>();

    public CharacterFormat getFormat(String font, int size, boolean bold, boolean italic) {
        CharacterFormat temp = new CharacterFormat(font, size, bold, italic);
        formats.putIfAbsent(temp, temp); // Add if not present
        return formats.get(temp); // Return shared instance
    }
}
