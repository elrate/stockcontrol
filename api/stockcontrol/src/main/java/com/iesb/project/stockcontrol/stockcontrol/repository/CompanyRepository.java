package com.iesb.project.stockcontrol.stockcontrol.repository;

import com.iesb.project.stockcontrol.stockcontrol.model.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyEntity,Long> {
}
