package com.satsumaimo.structural.bridge.awkwarddesign.model.shape.square;

import com.satsumaimo.structural.bridge.awkwarddesign.model.shape.Shape;

public class MediumDashedLinedSquare extends Shape {
    private static final int SQUARE_CORNERS = 4;
    public MediumDashedLinedSquare() {
        this.corners = SQUARE_CORNERS;
    }

    @Override
    public void kickStart() {
        System.out.println("Kick starting " + MediumDashedLinedSquare.class.getSimpleName());
        System.out.println("I decided to draw meticulously..");
        for (int i = 0; i < corners; i++) {
            System.out.println("Draw 1 pt line with the pen off and on to the paper");
            System.out.println("Lift the pen, finish");
        }
    }
}
