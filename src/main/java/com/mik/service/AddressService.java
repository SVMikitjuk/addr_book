package com.mik.service;

import com.mik.model.Address;

import java.util.List;

/**
 * Created by mikitjuk on 02.10.15.
 */
public interface AddressService {
    public void create(Address address);
    public Address read(Integer id);
    public void update(Address address);
    public void delete(Address address);
    public List getListAll();
}
