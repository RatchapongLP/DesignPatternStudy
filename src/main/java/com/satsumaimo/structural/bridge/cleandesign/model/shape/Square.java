package com.satsumaimo.structural.bridge.cleandesign.model.shape;

import com.satsumaimo.structural.bridge.cleandesign.model.outline.Outline;

public class Square extends Shape {
    private static final int SQUARE_CORNERS = 4;
    public Square(Outline outline) {
        super(outline);
        this.corners = SQUARE_CORNERS;
    }

    @Override
    public void kickStart() {
        System.out.println("Kick starting " + Square.class.getSimpleName());
        System.out.println("I decided to draw meticulously..");
        for (int i = 0; i < corners; i++) {
            outline.draw();
        }
    }
}
