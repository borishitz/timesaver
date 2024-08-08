package com.timesaver.timesaver.repository;

import com.timesaver.timesaver.domain.Shop;
import com.timesaver.timesaver.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepo extends JpaRepository<Shop, Long> {

}
