package com.satsumaimo.creational.factory.developer;

import com.satsumaimo.model.Vehicle;
import com.satsumaimo.product.Sedan;

public class SedanFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Sedan();
    }
}
