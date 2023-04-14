package com.iesb.project.stockcontrol.stockcontrol.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.*;

@Entity
@Table(name="product")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {
    @Id
    @Column(name = "id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "validity",nullable = true)
    private Date validity;

    @Column(name = "manufacture",nullable = false)
    private Date manufacture;

    @Column(name = "brand",nullable = true)
    private String brand;

    @ManyToMany(mappedBy = "products", fetch = FetchType.LAZY)
    private Set<CompanyEntity> companies = new HashSet<>();

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "product_category",
            joinColumns = { @JoinColumn(name = "product_id") },
            inverseJoinColumns = { @JoinColumn(name = "category_id") }
    )
    private List<CategoryEntity> categories = new ArrayList<>();
}
