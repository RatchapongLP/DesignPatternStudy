package com.satsumaimo.client;

import com.satsumaimo.creational.VehicleFactory;
import com.satsumaimo.model.Vehicle;

public class VehicleRunInService {
    public void runInVehicle(VehicleFactory vehicleFactory) {
        Vehicle vehicle = vehicleFactory.createVehicle();
        vehicle.start();
        vehicle.accelerate();
        vehicle.decelerate();
        vehicle.uTurn();
        vehicle.stop();
    }
}
