package com.iesb.project.stockcontrol.stockcontrol.controller;

import com.iesb.project.stockcontrol.stockcontrol.dto.CompanyDTO;
import com.iesb.project.stockcontrol.stockcontrol.model.CompanyEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController {

    @GetMapping
    public List<CompanyEntity> list(){
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CompanyEntity> search(@PathVariable Long id){
        return null;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CompanyDTO add(@RequestBody CompanyEntity company){
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<CompanyEntity> update(@PathVariable Long id,@RequestBody CompanyEntity company){
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> remove(@PathVariable Long id){
        return null;
    }
}
