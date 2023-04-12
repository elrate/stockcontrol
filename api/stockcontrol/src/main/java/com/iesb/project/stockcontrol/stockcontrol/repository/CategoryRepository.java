package com.iesb.project.stockcontrol.stockcontrol.repository;

import com.iesb.project.stockcontrol.stockcontrol.model.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity,Long>{
}
