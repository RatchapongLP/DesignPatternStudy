package com.satsumaimo.structural.flyweight.developer;

/**
 * Character class: holds extrinsic state
 */
public class Character {
    private final char character;
    private final int position;
    private final CharacterFormat format;

    public Character(char character, int position, CharacterFormat format) {
        this.character = character;
        this.position = position;
        this.format = format;
    }

    public void display() {
        System.out.println("'" + character + "' at position " + position + " with format: " + format);
    }
}

