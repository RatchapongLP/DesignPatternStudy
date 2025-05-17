package com.satsumaimo.structural.bridge.awkwarddesign.model.shape.square;

import com.satsumaimo.structural.bridge.awkwarddesign.model.shape.Shape;

public class ThickDashedLinedSquare extends Shape {
    private static final int SQUARE_CORNERS = 4;
    public ThickDashedLinedSquare() {
        this.corners = SQUARE_CORNERS;
    }

    @Override
    public void kickStart() {
        System.out.println("Kick starting " + ThickDashedLinedSquare.class.getSimpleName());
        System.out.println("I decided to draw meticulously..");
        for (int i = 0; i < corners; i++) {
            System.out.println("Draw 1.5 pt line with the pen off and on to the paper");
            System.out.println("Lift the pen, finish");
        }
    }
}
