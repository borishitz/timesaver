package com.timesaver.timesaver.services;

import com.timesaver.timesaver.domain.TravelAgency;
import com.timesaver.timesaver.domain.Trip;
import com.timesaver.timesaver.repository.TravelAgencyRepo;
import com.timesaver.timesaver.repository.TripRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TravelAgencyService {
    @Autowired
    TravelAgencyRepo travelAgencyRepo;

    public List<TravelAgency> getAllTravelAgency() {
        return (List<TravelAgency>) travelAgencyRepo.findAll();
    }

    public TravelAgency saveTravelAgency(TravelAgency travelAgency){
        return travelAgencyRepo.save(travelAgency);
    }


    public TravelAgency getTravelAgencyByID(long ID){
        Optional<TravelAgency> model= travelAgencyRepo.findById(ID);
        if (model.isPresent())
        {
            return model.get();
        }
        return null;
    }

    public long countTravelAgency(){
        long count = travelAgencyRepo.count();
        return count;
    }
}
