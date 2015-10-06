package com.mik.model;

import javax.persistence.*;

/**
 * Created by mikitjuk on 30.09.15.
 */
@Entity
@Table(name = "address")
public class Address {
    private Integer id;
    private AddressComplex addressComplex;
    private Phone phoneByIdPhone;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "id_address_complex", referencedColumnName = "id", nullable = false)
    public AddressComplex getAddressComplex() {
        return addressComplex;
    }

    public void setAddressComplex(AddressComplex addressComplex) {
        this.addressComplex = addressComplex;
    }

    @ManyToOne
    @JoinColumn(name = "id_phone", referencedColumnName = "id", nullable = false)
    public Phone getPhoneByIdPhone() {
        return phoneByIdPhone;
    }

    public void setPhoneByIdPhone(Phone phoneByIdPhone) {
        this.phoneByIdPhone = phoneByIdPhone;
    }


}
