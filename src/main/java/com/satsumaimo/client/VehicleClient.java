package com.satsumaimo.client;

import com.satsumaimo.creational.InputFactory;
import com.satsumaimo.creational.VehicleFactory;

public class VehicleClient {
    public static void main(String[] args) {
        VehicleFactory[] vehicleFactories = InputFactory.getVehicleFactoryList();

        // These services never have to change.
        // The services are the "real client" of the factories and the products.
        VehicleTestService vehicleTestService = new VehicleTestService();
        VehicleRunInService vehicleRunInService = new VehicleRunInService();

        for (VehicleFactory vehicleFactory : vehicleFactories) {
            vehicleTestService.testVehicle(vehicleFactory);
            vehicleRunInService.runInVehicle(vehicleFactory);
        }
    }
}
