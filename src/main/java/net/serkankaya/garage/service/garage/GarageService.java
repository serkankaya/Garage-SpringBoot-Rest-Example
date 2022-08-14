package net.serkankaya.garage.service.garage;

import net.serkankaya.garage.model.resp.GarageResponse;
import net.serkankaya.garage.resources.garage.model.VehicleInput;

public interface GarageService {

    GarageResponse<String> park(VehicleInput input);
    GarageResponse<String> leave(Integer ticketNumber);
    GarageResponse<String> status();
    GarageResponse<String> clearCache();
}
