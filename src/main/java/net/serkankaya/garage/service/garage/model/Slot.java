package net.serkankaya.garage.service.garage.model;

import lombok.Data;

@Data
public class Slot {
    private Integer slotNumber;
    private Ticket ticket;
}
