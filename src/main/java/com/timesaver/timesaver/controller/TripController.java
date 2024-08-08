package com.timesaver.timesaver.controller;

import com.timesaver.timesaver.domain.Products;
import com.timesaver.timesaver.domain.Shop;
import com.timesaver.timesaver.domain.TravelAgency;
import com.timesaver.timesaver.domain.Trip;
import com.timesaver.timesaver.global.GlobalData;
import com.timesaver.timesaver.repository.TravelAgencyRepo;
import com.timesaver.timesaver.repository.TripRepo;
import com.timesaver.timesaver.services.TripSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TripController {

    @Autowired
    TripSer tripSer;

    @Autowired
    TripRepo tripRepo;

    @Autowired
    TravelAgencyRepo travelAgencyRepo;

    //    DISPLAY ALL Trips
    @GetMapping("/allTrips")
    public String getAllTrips(Model model){
        List<Trip> tripList = tripSer.getAllTrips();
        model.addAttribute("cartCount", GlobalData.cart.size());
        model.addAttribute("tripList", tripList);
        return "trip/allTrips";
    }

    //CREATE NEW Trip BY ID
    @GetMapping("/new/trip/{id}")
    public String showNewTripForm(@PathVariable("id") Long id, Model model){
        TravelAgency travelAgency = travelAgencyRepo.findById(id).get();
        model.addAttribute("trip",new Trip());
        model.addAttribute("travelAgency", travelAgency);
        return "trip/addTrip";
    }

    //SAVE Trip TO DATABASE
    @PostMapping("/saveTrip")
    public String saveTrip(Trip trip) {
        tripSer.saveTrip(trip);
        return "redirect:/allTrips";
    }

    //find all trip in a travel agency
    @RequestMapping(value = "/travelAgency/trips/{id}")
    public String getTripByTravelAgencyId(@PathVariable Long id,Model model){
        List<Trip> travelAgencyTrip = tripSer.getTripByTravelAgencyId(id);
        TravelAgency travelAgency = travelAgencyRepo.findById(id).get();
        model.addAttribute("travelAgencyTrip",travelAgencyTrip);
        model.addAttribute("travelAgency", travelAgency);
        model.addAttribute("cartCount", GlobalData.cart.size());
        return "trip/travelAgencyTrips";
    }

    //SEE THE FULL PROFILE OF TRIP
    @GetMapping("/trip/detail/{id}")
    public String showTripDetail(@PathVariable("id") Long id, Model model){
        Trip trip = tripRepo.findById(id).get();
        model.addAttribute("cartCount", GlobalData.cart.size());
        model.addAttribute("trip", trip);
        return "trip/tripDetail";
    }
}
