package com.satsumaimo.structural.bridge.model;

public class MediumDashedLine implements Outline {
    @Override
    public void draw() {
        System.out.println("Draw 1 pt line with the pen off and on to the paper");
        System.out.println("Lift the pen, finish");
    }
}
