package com.timesaver.timesaver.repository;

import com.timesaver.timesaver.domain.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Products,Long> {

    public List<Products> findByShopId(Long StudentId);
}
