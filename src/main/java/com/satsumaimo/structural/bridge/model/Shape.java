package com.satsumaimo.structural.bridge.model;

/*
When:

                   ----Shape---
                  /            \
         Rectangle              Circle
        /         \            /      \
BlueRectangle  RedRectangle BlueCircle RedCircle

Refactor to:

          ----Shape---                        Color
         /            \                       /   \
Rectangle(Color)   Circle(Color)           Blue   Red
        */

public abstract class Shape {
    protected Outline outline;
    protected int corners;

    public Shape(Outline outline) {
        this.outline = outline;
    }

    public abstract void kickStart();
}
