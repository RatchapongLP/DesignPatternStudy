package com.satsumaimo.structural.bridge.client;

import com.satsumaimo.structural.bridge.model.*;

public class Main {
    public static void main(String[] args) {
        Shape square1 = new Square(new MediumDashedLine());
        Shape triangle1 = new Triangle(new ThickContinuousLine());
        square1.kickStart();
        triangle1.kickStart();
    }
}
