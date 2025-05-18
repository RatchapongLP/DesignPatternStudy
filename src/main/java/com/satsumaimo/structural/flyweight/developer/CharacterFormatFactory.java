package com.satsumaimo.structural.flyweight.developer;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Flyweight Factory: creates and reuses formatting instances
 */
public class CharacterFormatFactory {
//    private final Map<CharacterFormat, CharacterFormat> formats = new HashMap<>();
    private final Map<CharacterFormat, CharacterFormat> formats = new ConcurrentHashMap<>();

    public CharacterFormat getFormat(String font, int size, boolean bold, boolean italic) {
        CharacterFormat format = new CharacterFormat(font, size, bold, italic);
//       return formats.computeIfAbsent(format, k -> format); // For single-threaded app

        // Simulate thread race condition in multithreaded app
        if (!formats.containsKey(format)) {
            try {
                Thread.sleep(1); // Force overlap
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return formats.computeIfAbsent(format, k -> format); // Return the newly inserted value of the key
//        formats.putIfAbsent(format, format);
//        return formats.get(format);
    }

    public int getFormatsSize() {
        return formats.size();
    }
}
