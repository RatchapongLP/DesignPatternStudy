package com.satsumaimo.creational.factory.developer;

public class InputFactory {
    // This is the only changes.
    // Suppose that every time a new implementation of Vehicle is released,
    // another developer team does a new factory implementation to handle the released.
    public static VehicleFactory[] getVehicleFactoryList() {
        return new VehicleFactory[]{new SedanFactory(), new HatchbackFactory()};
    }
}
