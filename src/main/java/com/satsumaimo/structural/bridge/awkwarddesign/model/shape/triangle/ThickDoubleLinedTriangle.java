package com.satsumaimo.structural.bridge.awkwarddesign.model.shape.triangle;

import com.satsumaimo.structural.bridge.awkwarddesign.model.shape.Shape;

public class ThickDoubleLinedTriangle extends Shape {
    private static final int TRIANGLE_CORNERS = 4;

    public ThickDoubleLinedTriangle() {
        this.corners = TRIANGLE_CORNERS;
    }

    @Override
    public void kickStart() {
        System.out.println("Kick starting " + ThickDoubleLinedTriangle.class.getSimpleName());
        System.out.println("I decided to draw roughly!");
        System.out.println("Draw 1.5 pt double line without lifting the pen");
        System.out.println("Lift the pen, finish");
    }
}
