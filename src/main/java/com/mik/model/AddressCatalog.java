package com.mik.model;

import javax.persistence.*;

/**
 * Created by mikitjuk on 30.09.15.
 */
@Entity
@Table(name = "address")
public class AddressCatalog {
    private Integer id;
    private Building buildingByIdBuild;
    private Street streetByIdStreet;
    private City cityByIdCity;
    private Country countryByIdCountry;
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
    @JoinColumn(name = "id_build", referencedColumnName = "id", nullable = false)
    public Building getBuildingByIdBuild() {
        return buildingByIdBuild;
    }

    public void setBuildingByIdBuild(Building buildingByIdBuild) {
        this.buildingByIdBuild = buildingByIdBuild;
    }

    @ManyToOne
    @JoinColumn(name = "id_street", referencedColumnName = "id", nullable = false)
    public Street getStreetByIdStreet() {
        return streetByIdStreet;
    }

    public void setStreetByIdStreet(Street streetByIdStreet) {
        this.streetByIdStreet = streetByIdStreet;
    }

    @ManyToOne
    @JoinColumn(name = "id_city", referencedColumnName = "id", nullable = false)
    public City getCityByIdCity() {
        return cityByIdCity;
    }

    public void setCityByIdCity(City cityByIdCity) {
        this.cityByIdCity = cityByIdCity;
    }

    @ManyToOne
    @JoinColumn(name = "id_country", referencedColumnName = "id", nullable = false)
    public Country getCountryByIdCountry() {
        return countryByIdCountry;
    }

    public void setCountryByIdCountry(Country countryByIdCountry) {
        this.countryByIdCountry = countryByIdCountry;
    }

    @ManyToOne
    @JoinColumn(name = "id_phone", referencedColumnName = "id", nullable = false)
    public Phone getPhoneByIdPhone() {
        return phoneByIdPhone;
    }

    public void setPhoneByIdPhone(Phone phoneByIdPhone) {
        this.phoneByIdPhone = phoneByIdPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddressCatalog address = (AddressCatalog) o;

        if (buildingByIdBuild != null ? !buildingByIdBuild.equals(address.buildingByIdBuild) : address.buildingByIdBuild != null)
            return false;
        if (cityByIdCity != null ? !cityByIdCity.equals(address.cityByIdCity) : address.cityByIdCity != null)
            return false;
        if (countryByIdCountry != null ? !countryByIdCountry.equals(address.countryByIdCountry) : address.countryByIdCountry != null)
            return false;
        if (id != null ? !id.equals(address.id) : address.id != null) return false;
        if (phoneByIdPhone != null ? !phoneByIdPhone.equals(address.phoneByIdPhone) : address.phoneByIdPhone != null)
            return false;
        if (streetByIdStreet != null ? !streetByIdStreet.equals(address.streetByIdStreet) : address.streetByIdStreet != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (buildingByIdBuild != null ? buildingByIdBuild.hashCode() : 0);
        result = 31 * result + (streetByIdStreet != null ? streetByIdStreet.hashCode() : 0);
        result = 31 * result + (cityByIdCity != null ? cityByIdCity.hashCode() : 0);
        result = 31 * result + (countryByIdCountry != null ? countryByIdCountry.hashCode() : 0);
        result = 31 * result + (phoneByIdPhone != null ? phoneByIdPhone.hashCode() : 0);
        return result;
    }
}
