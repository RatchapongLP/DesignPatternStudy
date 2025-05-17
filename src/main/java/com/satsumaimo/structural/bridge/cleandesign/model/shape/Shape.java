package com.satsumaimo.structural.bridge.cleandesign.model.shape;

import com.satsumaimo.structural.bridge.cleandesign.model.outline.Outline;

public abstract class Shape {
    protected Outline outline;
    protected int corners;

    public Shape(Outline outline) {
        this.outline = outline;
    }

    public abstract void kickStart();
}
