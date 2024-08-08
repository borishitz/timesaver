package com.timesaver.timesaver.services;

import com.timesaver.timesaver.domain.Products;
import com.timesaver.timesaver.repository.ProductRepo;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductSer {
    @Autowired
    ProductRepo productRepo;

    public List<Products> getAllProducts() {
        return (List<Products>) productRepo.findAll();
    }

    public Products saveProduct(Products product){
        return productRepo.save(product);
    }

    public List<Products> getProductsByShopId(Long id) {
        return productRepo.findByShopId(id);
    }

    public Products getProductsByID(long ID){
        Optional<Products> model=productRepo.findById(ID);
        if (model.isPresent())
        {
            return model.get();
        }
        return null;
    }

    public long countProducts(){
        long count = productRepo.count();
        return count;
    }

}
