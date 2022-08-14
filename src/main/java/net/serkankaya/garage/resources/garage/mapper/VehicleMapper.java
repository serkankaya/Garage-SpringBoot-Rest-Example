package net.serkankaya.garage.resources.garage.mapper;

import net.serkankaya.garage.resources.garage.model.VehicleInput;
import net.serkankaya.garage.service.garage.model.Vehicle;

public class VehicleMapper {

    public static Vehicle toVehicle(VehicleInput input) {
        Vehicle vehicle = new Vehicle();
        vehicle.setPlate(input.getPlate());
        vehicle.setColor(input.getColor());
        vehicle.setVehicleType(input.getVehicleType());
        return vehicle;
    }

}
