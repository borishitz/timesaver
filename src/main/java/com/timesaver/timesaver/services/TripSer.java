package com.timesaver.timesaver.services;

import com.timesaver.timesaver.domain.Products;
import com.timesaver.timesaver.domain.Trip;
import com.timesaver.timesaver.repository.TripRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TripSer {
    @Autowired
    TripRepo tripRepo;

    public List<Trip> getAllTrips() {
        return (List<Trip>) tripRepo.findAll();
    }

    public Trip saveTrip(Trip trip){
        return tripRepo.save(trip);
    }

    public List<Trip> getTripByTravelAgencyId(Long id) {
        return tripRepo.findByTravelAgencyId(id);
    }


    public Trip getTripsByID(long ID){
        Optional<Trip> model= tripRepo.findById(ID);
        if (model.isPresent())
        {
            return model.get();
        }
        return null;
    }

    public long countTrips(){
        long count = tripRepo.count();
        return count;
    }
}
