package com.iesb.project.stockcontrol.stockcontrol.dto;

import com.iesb.project.stockcontrol.stockcontrol.model.AddressEntity;
import lombok.Data;

@Data
public class CompanyDTO {
    private String name;
    private AddressEntity address;
}
