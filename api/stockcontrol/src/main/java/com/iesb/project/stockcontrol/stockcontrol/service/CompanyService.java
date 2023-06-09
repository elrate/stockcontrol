package com.iesb.project.stockcontrol.stockcontrol.service;

import com.iesb.project.stockcontrol.stockcontrol.dto.CompanyDTO;
import com.iesb.project.stockcontrol.stockcontrol.model.CompanyEntity;
import com.iesb.project.stockcontrol.stockcontrol.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository repository;

    private CompanyEntity companySaved = new CompanyEntity();

    public List<CompanyEntity> list(){
        repository.findAll();
        return null;
    }

    public CompanyEntity save(CompanyEntity company){
        //DTO -> Entity
        repository.save(company);
        return null;
    }

    public void update(Long id, CompanyDTO company){
        repository.findById(id);
        //Verify if exists
        repository.save(companySaved);
    }

    public void remove(Long id){
        repository.deleteById(id);
    }
}
