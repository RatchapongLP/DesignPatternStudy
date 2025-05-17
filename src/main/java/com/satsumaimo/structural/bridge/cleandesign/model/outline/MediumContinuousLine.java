package com.satsumaimo.structural.bridge.cleandesign.model.outline;

public class MediumContinuousLine implements Outline {
    @Override
    public void draw() {
        System.out.println("Draw 1 pt line without lifting the pen");
        System.out.println("Lift the pen, finish");
    }
}
