package com.satsumaimo.structural.flyweight.developer;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Flyweight Factory: creates and reuses formatting instances
 */
public class CharacterFormatFactory {
//    private final Map<CharacterFormat, CharacterFormat> formats = new HashMap<>();
    private final Map<CharacterFormat, CharacterFormat> formats = new ConcurrentHashMap<>();

    public CharacterFormat getFormat(String font, int size, boolean bold, boolean italic) {
        CharacterFormat temp = new CharacterFormat(font, size, bold, italic);
//        formats.putIfAbsent(temp, temp); // Add if not present

        // Simulate thread race condition
        if (!formats.containsKey(temp)) {
            try {
                Thread.sleep(1); // Force overlap
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            formats.put(temp, temp);
        }

        return formats.get(temp); // Return shared instance
    }

    public int getFormatsSize() {
        return formats.size();
    }
}
