package com.mik.dao;

import com.mik.model.Address;

import java.util.List;

/**
 * Created by mikitjuk on 30.09.15.
 */
public interface AddressDao {
    public void create(Address address);
    public Address read(Integer id);
    public void update(Address address);
    public void delete(Address address);
    public List getListAll();
}
