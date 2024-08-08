package com.timesaver.timesaver.services;

import com.timesaver.timesaver.domain.ProductOrder;
import com.timesaver.timesaver.domain.Products;
import com.timesaver.timesaver.repository.ProductOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductOrderSer {
    @Autowired
    ProductOrderRepo productOrderRepo;

    public List<ProductOrder> getAllProductOrders() {
        return (List<ProductOrder>) productOrderRepo.findAll();
    }

    public ProductOrder saveProductOrder(ProductOrder productOrder){
        return productOrderRepo.save(productOrder);
    }

}
