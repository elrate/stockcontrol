package com.iesb.project.stockcontrol.stockcontrol.controller;

import com.iesb.project.stockcontrol.stockcontrol.dto.ProductDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public List<ProductDTO> list(){
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> search(@PathVariable Long id){
        return null;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductDTO add(@RequestBody ProductDTO product){
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductDTO> update(@PathVariable Long id,@RequestBody ProductDTO product){
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> remove(@PathVariable Long id){
        return null;
    }
}
