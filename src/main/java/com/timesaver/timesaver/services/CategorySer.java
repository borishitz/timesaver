package com.timesaver.timesaver.services;

import com.timesaver.timesaver.domain.Category;
import com.timesaver.timesaver.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorySer {
    @Autowired
    CategoryRepo categoryRepo;

    public List<Category> getAllCategory() {
        return categoryRepo.findAll();
    }

    public Category saveCategory(Category category){
        return categoryRepo.save(category);
    }

    public long countCategory(){
        long count = categoryRepo.count();
        return count;
    }
}
