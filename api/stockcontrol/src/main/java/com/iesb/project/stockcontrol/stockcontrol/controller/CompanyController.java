package com.iesb.project.stockcontrol.stockcontrol.controller;

import com.iesb.project.stockcontrol.stockcontrol.dto.CompanyDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController {

    @GetMapping
    public List<CompanyDTO> list(){
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CompanyDTO> search(@PathVariable Long id){
        return null;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CompanyDTO add(@RequestBody CompanyDTO company){
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<CompanyDTO> update(@PathVariable Long id,@RequestBody CompanyDTO company){
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> remove(@PathVariable Long id){
        return null;
    }
}
