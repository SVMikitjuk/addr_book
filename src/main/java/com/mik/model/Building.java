package com.mik.model;

import javax.persistence.*;

/**
 * Created by mikitjuk on 30.09.15.
 */
@Entity
@Table(name = "building")
public class Building {
    private Integer id;
    private String number;
    private Street idStreet;

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
    @JoinColumn(name = "id_street", referencedColumnName = "id", nullable = false)
    public Street getIdStreet() {
        return idStreet;
    }

    public void setIdStreet(Street idStreet) {
        this.idStreet = idStreet;
    }

    @Basic
    @Column(name = "number", nullable = false, insertable = true, updatable = true, length = 5)
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Building building = (Building) o;

        if (id != null ? !id.equals(building.id) : building.id != null) return false;
        if (number != null ? !number.equals(building.number) : building.number != null) return false;
        if (idStreet != null ? !idStreet.equals(building.idStreet) : building.idStreet != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (idStreet != null ? idStreet.hashCode() : 0);
        return result;
    }
}
