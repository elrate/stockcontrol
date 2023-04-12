package com.iesb.project.stockcontrol.stockcontrol.repository;

import com.iesb.project.stockcontrol.stockcontrol.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Long> {
}
