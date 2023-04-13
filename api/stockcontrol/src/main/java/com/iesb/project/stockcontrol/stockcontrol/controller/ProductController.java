package com.iesb.project.stockcontrol.stockcontrol.controller;

import com.iesb.project.stockcontrol.stockcontrol.dto.ProductDTO;
import com.iesb.project.stockcontrol.stockcontrol.model.ProductEntity;
import com.iesb.project.stockcontrol.stockcontrol.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping
    public List<ProductEntity> list(){
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductEntity> search(@PathVariable Long id){
        return null;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductEntity add(@RequestBody ProductEntity product){
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductEntity> update(@PathVariable Long id,@RequestBody ProductEntity product){
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> remove(@PathVariable Long id){
        return null;
    }
}
