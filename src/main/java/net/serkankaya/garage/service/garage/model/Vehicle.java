package net.serkankaya.garage.service.garage.model;

import lombok.Data;
import net.serkankaya.garage.model.enums.VehicleEnum;

@Data
public class Vehicle {
    private String plate;
    private String color;
    private VehicleEnum vehicleType;
}
