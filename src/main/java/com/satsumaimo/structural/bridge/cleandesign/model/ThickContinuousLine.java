package com.satsumaimo.structural.bridge.cleandesign.model;

public class ThickContinuousLine implements Outline {
    @Override
    public void draw() {
        System.out.println("Draw 1.5 pt line without lifting the pen");
        System.out.println("Lift the pen, finish");
    }
}
