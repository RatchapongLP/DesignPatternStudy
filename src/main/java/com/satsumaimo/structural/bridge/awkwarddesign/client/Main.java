package com.satsumaimo.structural.bridge.awkwarddesign.client;

import com.satsumaimo.structural.bridge.awkwarddesign.model.shape.square.MediumDashedLinedSquare;
import com.satsumaimo.structural.bridge.awkwarddesign.model.shape.triangle.MediumDashedLinedTriangle;
import com.satsumaimo.structural.bridge.awkwarddesign.model.shape.Shape;
import com.satsumaimo.structural.bridge.awkwarddesign.model.shape.square.ThickContinuousLinedSquare;
import com.satsumaimo.structural.bridge.awkwarddesign.model.shape.triangle.ThickContinuousLinedTriangle;

public class Main {
    public static void main(String[] args) {
        Shape thickContinuousLinedSquare = new ThickContinuousLinedSquare();
        Shape mediumDashedLinedSquare = new MediumDashedLinedSquare();
        Shape thickContinuousLinedTriangle = new ThickContinuousLinedTriangle();
        Shape mediumDashedLinedTriangle = new MediumDashedLinedTriangle();
        thickContinuousLinedSquare.kickStart();
        mediumDashedLinedSquare.kickStart();
        thickContinuousLinedTriangle.kickStart();
        mediumDashedLinedTriangle.kickStart();
    }
}
