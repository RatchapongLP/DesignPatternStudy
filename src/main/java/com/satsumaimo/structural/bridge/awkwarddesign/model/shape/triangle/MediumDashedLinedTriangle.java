package com.satsumaimo.structural.bridge.awkwarddesign.model.shape.triangle;

import com.satsumaimo.structural.bridge.awkwarddesign.model.shape.Shape;

public class MediumDashedLinedTriangle extends Shape {
    private static final int TRIANGLE_CORNERS = 4;

    public MediumDashedLinedTriangle() {
        this.corners = TRIANGLE_CORNERS;
    }

    @Override
    public void kickStart() {
        System.out.println("Kick starting " + MediumDashedLinedTriangle.class.getSimpleName());
        System.out.println("I decided to draw roughly!");
        System.out.println("Draw 1 pt line with the pen off and on to the paper");
        System.out.println("Lift the pen, finish");
    }
}
