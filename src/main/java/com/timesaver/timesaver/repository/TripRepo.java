package com.timesaver.timesaver.repository;

import com.timesaver.timesaver.domain.Products;
import com.timesaver.timesaver.domain.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TripRepo extends JpaRepository<Trip, Long> {
    public List<Trip> findByTravelAgencyId(Long tripId);
}
