package net.serkankaya.garage.service.garage.model;

import lombok.Data;

@Data
public class Ticket {
    private Integer ticketNumber;
    private Vehicle vehicle;
}
