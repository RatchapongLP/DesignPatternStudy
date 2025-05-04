package com.satsumaimo.creational.factory.developer;

import com.satsumaimo.model.Vehicle;
import com.satsumaimo.product.Hatchback;

public class HatchbackFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Hatchback();
    }
}
