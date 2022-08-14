package net.serkankaya.garage.resources.garage.model;

import lombok.Data;
import net.serkankaya.garage.model.enums.VehicleEnum;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Data
public class VehicleInput {

  @Size(min = 1,max = 20)
  @NotNull
  private String plate;

  @Size(min = 1,max = 30)
  @NotNull
  private String color;

  @NotNull
  private VehicleEnum vehicleType;

}