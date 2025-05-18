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
    static CharacterFormatFactory formatFactory = new CharacterFormatFactory();

    public static void main(String[] args) {
        int numOfThreads = 10;
        Thread[] thread = new Thread[numOfThreads];
        for (int i = 0; i < numOfThreads; i++) {
            final int threadNumber = i + 1;
            thread[i] = new Thread(() -> work(threadNumber));
            thread[i].start();
        }
        for (int i = 0; i < numOfThreads; i++) {
            try {
                thread[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        // Expected = 2 shared object, but might be more!
        System.out.println("formatFactory.getFormatsSize() = " + formatFactory.getFormatsSize());
        System.out.println("formatFactory.getFormatsString() = " + formatFactory.getFormatsString());
    }

    private static void work(int threadNumber) {
        List<Character> document = new ArrayList<>();
   
        CharacterFormat regularFormat = formatFactory.getFormat("Arial", 12, false, false);
        String text = "Hello world";

        for (int i = 0; i < text.length(); i++) {
            document.add(new Character(text.charAt(i), i, regularFormat));
        }

        System.out.println("thread #" + threadNumber + " first part done.");
        CharacterFormat boldItalicFormat = formatFactory.getFormat("Arial", 12, true, true);
        document.add(new Character('!', text.length(), boldItalicFormat));
        System.out.println("thread #" + threadNumber + " second part done.");

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            renderDocument(document);
        }
    }

    public static void renderDocument(List<Character> document) {
        for (Character c : document) {
            c.display();
        }
    }
}
