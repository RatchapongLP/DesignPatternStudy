package com.satsumaimo.structural.bridge.awkwarddesign.model.shape.square;

import com.satsumaimo.structural.bridge.awkwarddesign.model.shape.Shape;

public class ThickContinuousLinedSquare extends Shape {
    private static final int SQUARE_CORNERS = 4;
    public ThickContinuousLinedSquare() {
        this.corners = SQUARE_CORNERS;
    }

    @Override
    public void kickStart() {
        System.out.println("Kick starting " + ThickContinuousLinedSquare.class.getSimpleName());
        System.out.println("I decided to draw meticulously..");
        for (int i = 0; i < corners; i++) {
            System.out.println("Draw 1.5 pt line without lifting the pen");
            System.out.println("Lift the pen, finish");
        }
    }
}
