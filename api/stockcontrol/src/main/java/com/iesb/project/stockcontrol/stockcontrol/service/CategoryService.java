package com.iesb.project.stockcontrol.stockcontrol.service;

import com.iesb.project.stockcontrol.stockcontrol.dto.CategoryDTO;
import com.iesb.project.stockcontrol.stockcontrol.model.CategoryEntity;
import com.iesb.project.stockcontrol.stockcontrol.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<CategoryDTO> list(){
        repository.findAll();
        return null;
    }

    public CategoryDTO save(CategoryDTO category){
        CategoryEntity categorySaved = new CategoryEntity();
        //DTO -> Entity
        repository.save(categorySaved);
        return null;
    }
}
