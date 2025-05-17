package com.satsumaimo.structural.bridge.cleandesign.client;

import com.satsumaimo.structural.bridge.cleandesign.model.outline.MediumContinuousLine;
import com.satsumaimo.structural.bridge.cleandesign.model.outline.MediumDashedLine;
import com.satsumaimo.structural.bridge.cleandesign.model.shape.Shape;
import com.satsumaimo.structural.bridge.cleandesign.model.shape.Square;
import com.satsumaimo.structural.bridge.cleandesign.model.outline.ThickContinuousLine;
import com.satsumaimo.structural.bridge.cleandesign.model.outline.ThickDashedLine;
import com.satsumaimo.structural.bridge.cleandesign.model.outline.ThinContinuousLine;
import com.satsumaimo.structural.bridge.cleandesign.model.outline.ThinDashedLine;
import com.satsumaimo.structural.bridge.cleandesign.model.shape.Triangle;

public class Main {
    public static void main(String[] args) {
        Shape square1 = new Square(new ThinDashedLine());
        Shape square2 = new Square(new MediumDashedLine());
        Shape square3 = new Square(new ThickDashedLine());
        Shape triangle1 = new Triangle(new ThinContinuousLine());
        Shape triangle2 = new Triangle(new MediumContinuousLine());
        Shape triangle3 = new Triangle(new ThickContinuousLine());
        square1.kickStart();
        square2.kickStart();
        square3.kickStart();
        triangle1.kickStart();
        triangle2.kickStart();
        triangle3.kickStart();
    }
}
