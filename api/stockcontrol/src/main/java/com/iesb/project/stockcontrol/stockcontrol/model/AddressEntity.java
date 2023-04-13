package com.iesb.project.stockcontrol.stockcontrol.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable //Classe imcoporavel, tem a capacidade de se imcorporada a uma entidade
public class AddressEntity {

    @Column(name="address_zip_code")
    private String zipCode;

    @Column(name="address_street")
    private String street;

    @Column(name="address_city")
    private String city;

    @Column(name="address_state")
    private String state;

}