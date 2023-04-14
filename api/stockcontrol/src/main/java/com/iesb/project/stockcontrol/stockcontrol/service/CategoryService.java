package com.iesb.project.stockcontrol.stockcontrol.service;

import com.iesb.project.stockcontrol.stockcontrol.dto.CategoryDTO;
import com.iesb.project.stockcontrol.stockcontrol.exception.CategoryBadRequestException;
import com.iesb.project.stockcontrol.stockcontrol.exception.CategoryNotFoundException;
import com.iesb.project.stockcontrol.stockcontrol.model.CategoryEntity;
import com.iesb.project.stockcontrol.stockcontrol.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService extends BusinessRulesChecks{

    @Autowired
    private CategoryRepository repository;

    public CategoryDTO search(Long id) throws CategoryNotFoundException {
        CategoryEntity entity = repository.findById(id).orElseThrow(()->new CategoryNotFoundException(id));
        return entityForDto(entity);
    }

    public CategoryDTO save(CategoryDTO dto) throws CategoryBadRequestException {
        CategoryEntity categorySaved = new CategoryEntity();
        if(!verifySize(dto.getName(),20))
            throw new CategoryBadRequestException("Submitted category name exceeds the maximum size");
        dtoForEntity(dto,categorySaved);
        repository.save(categorySaved);
        return dto;
    }

    private CategoryDTO entityForDto(CategoryEntity entity){
        CategoryDTO dto = new CategoryDTO(entity.getName());
        return dto;
    }
    private void dtoForEntity(CategoryDTO dto, CategoryEntity entity){
        entity.setName(dto.getName().trim().substring(0,1).toUpperCase());
    }
}
