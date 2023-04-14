package com.iesb.project.stockcontrol.stockcontrol.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ProductDTO {
    private String name;

    private Date validity;

    private Date manufacture;

    private String brand;
}
