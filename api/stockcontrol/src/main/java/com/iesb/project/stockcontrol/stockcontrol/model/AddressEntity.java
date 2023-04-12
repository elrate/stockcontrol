package com.iesb.project.stockcontrol.stockcontrol.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable //Classe imcoporavel, tem a capacidade de se imcorporada a uma entidade
public class AddressEntity {

    @Column(name="address_zip_code")
    private String zipCode;

}