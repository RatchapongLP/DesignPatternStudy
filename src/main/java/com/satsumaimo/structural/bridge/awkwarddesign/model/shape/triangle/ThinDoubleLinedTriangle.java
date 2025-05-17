package com.satsumaimo.structural.bridge.awkwarddesign.model.shape.triangle;

import com.satsumaimo.structural.bridge.awkwarddesign.model.shape.Shape;

public class ThinDoubleLinedTriangle extends Shape {
    private static final int TRIANGLE_CORNERS = 4;

    public ThinDoubleLinedTriangle() {
        this.corners = TRIANGLE_CORNERS;
    }

    @Override
    public void kickStart() {
        System.out.println("Kick starting " + ThinDoubleLinedTriangle.class.getSimpleName());
        System.out.println("I decided to draw roughly!");
        System.out.println("Draw 0.5 pt double line without lifting the pen");
        System.out.println("Lift the pen, finish");
    }
}
