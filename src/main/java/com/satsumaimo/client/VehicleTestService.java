package com.satsumaimo.client;

import com.satsumaimo.creational.VehicleFactory;
import com.satsumaimo.model.Vehicle;

public class VehicleTestService {
    public void testVehicle(VehicleFactory vehicleFactory) {
        // This is the critical point if we want to use a new implementation of Vehicle.
        // No class name is needed for both the factory and the product.
        Vehicle vehicle = vehicleFactory.createVehicle();
        vehicle.start();
        vehicle.accelerate();
        vehicle.decelerate();
        vehicle.uTurn();
        vehicle.stop();
    }
}
