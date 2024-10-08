package com.timesaver.timesaver.repository;

import com.timesaver.timesaver.domain.ProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductOrderRepo extends JpaRepository<ProductOrder, Long> {

}
