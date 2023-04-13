package com.iesb.project.stockcontrol.stockcontrol.service;

import com.iesb.project.stockcontrol.stockcontrol.dto.ProductDTO;
import com.iesb.project.stockcontrol.stockcontrol.model.ProductEntity;
import com.iesb.project.stockcontrol.stockcontrol.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    private ProductEntity productSaved = new ProductEntity();

    public List<ProductEntity> list(){
        repository.findAll();
        return null;
    }

    public ProductEntity save(ProductEntity product){
        //DTO -> Entity
        repository.save(product);
        return null;
    }

    public void update(Long id, ProductDTO product){
        repository.findById(id);
        //Verify if exists
        repository.save(productSaved);
    }

    public void remove(Long id){
        repository.deleteById(id);
    }
}
