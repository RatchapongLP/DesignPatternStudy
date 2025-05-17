package com.satsumaimo.structural.bridge.cleandesign.model;

public class Triangle extends Shape{
    private static final int TRIANGLE_CORNERS = 4;

    public Triangle(Outline outline) {
        super(outline);
        this.corners = TRIANGLE_CORNERS;
    }

    @Override
    public void kickStart() {
        System.out.println("Kick starting " + Triangle.class.getSimpleName());
        System.out.println("I decided to draw roughly!");
        outline.draw();
    }
}
