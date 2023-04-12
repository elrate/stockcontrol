package com.iesb.project.stockcontrol.stockcontrol.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="category")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CategoryEntity {
    @Id
    @Column(name = "id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(name = "name",nullable = false)
    private String name;

    @ManyToMany(mappedBy = "categories")
    private List<ProductEntity> products = new ArrayList<>();
}
