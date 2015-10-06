package com.mik.model;

import javax.persistence.*;

/**
 * Created by mikitjuk on 06.10.15.
 */
@Entity
@Table(name = "address_complex")
public class AddressComplex {

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "build")
    protected String build;

    @Column(name = "street")
    protected String street;

    @Column(name = "city")
    protected String city;

    @Column(name = "country")
    protected String country;

    public AddressComplex() {
    }

    public AddressComplex(String country, String city, String street, String build) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.build = build;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
