package com.satsumaimo.structural.bridge.cleandesign.model.outline;

public class ThinDoubleLine implements Outline {
    @Override
    public void draw() {
        System.out.println("Draw 0.5 pt double line without lifting the pen");
        System.out.println("Lift the pen, finish");
    }
}
