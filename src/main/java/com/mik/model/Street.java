package com.mik.model;

import javax.persistence.*;

/**
 * Created by mikitjuk on 30.09.15.
 */
@Entity
@Table(name = "addrBook.street")
public class Street {
    private Integer id;
    private String name;
    private City idCity;

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
    @JoinColumn(name = "id_city", referencedColumnName = "id", nullable = false)
    public City getIdCity() {
        return idCity;
    }

    public void setIdCity(City idCity) {
        this.idCity = idCity;
    }

    @Column(name = "name", nullable = false, insertable = true, updatable = true, length = 150)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Street street = (Street) o;

        if (idCity != null ? !idCity.equals(street.idCity) : street.idCity != null)
            return false;
        if (id != null ? !id.equals(street.id) : street.id != null) return false;
        if (name != null ? !name.equals(street.name) : street.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (idCity != null ? idCity.hashCode() : 0);
        return result;
    }
}
