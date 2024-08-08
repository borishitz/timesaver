package com.timesaver.timesaver.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.Timer;

@Data
@Entity
@Table(name = "trip")
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String startLocation;
    private String destination;
    private String busNumber;
    private String date;
    private String departureTime;
    private Long ticketPrice;

    @ManyToOne
    private TravelAgency travelAgency;
}
