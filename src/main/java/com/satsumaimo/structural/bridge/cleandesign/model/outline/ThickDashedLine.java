package com.satsumaimo.structural.bridge.cleandesign.model.outline;

public class ThickDashedLine implements Outline {
    @Override
    public void draw() {
        System.out.println("Draw 1.5 pt line with the pen off and on to the paper");
        System.out.println("Lift the pen, finish");
    }
}
