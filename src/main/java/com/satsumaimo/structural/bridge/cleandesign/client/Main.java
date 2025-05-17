package com.satsumaimo.structural.bridge.cleandesign.client;

import com.satsumaimo.structural.bridge.cleandesign.model.MediumDashedLine;
import com.satsumaimo.structural.bridge.cleandesign.model.Shape;
import com.satsumaimo.structural.bridge.cleandesign.model.Square;
import com.satsumaimo.structural.bridge.cleandesign.model.ThickContinuousLine;
import com.satsumaimo.structural.bridge.cleandesign.model.Triangle;
import com.satsumaimo.structural.bridge.model.*;

public class Main {
    public static void main(String[] args) {
        Shape square1 = new Square(new MediumDashedLine());
        Shape triangle1 = new Triangle(new ThickContinuousLine());
        square1.kickStart();
        triangle1.kickStart();
    }
}
