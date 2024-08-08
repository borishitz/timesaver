package com.timesaver.timesaver.repository;

import com.timesaver.timesaver.domain.TravelAgency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelAgencyRepo extends JpaRepository<TravelAgency, Long> {

}
