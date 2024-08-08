package com.timesaver.timesaver.services;

import com.timesaver.timesaver.domain.Shop;
import com.timesaver.timesaver.repository.ShopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopSer {
    @Autowired
    ShopRepo shopRepo;

    public List<Shop> getAllShops() {
        return shopRepo.findAll();
    }

    public Shop saveShop(Shop shop){
        return shopRepo.save(shop);
    }

    public long countShops(){
        long count = shopRepo.count();
        return count;
    }
}
