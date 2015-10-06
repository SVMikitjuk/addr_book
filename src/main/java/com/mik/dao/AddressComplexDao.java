package com.mik.dao;

import com.mik.model.AddressComplex;

/**
 * Created by mikitjuk on 06.10.15.
 */
public interface AddressComplexDao {
    public void create(AddressComplex address);
    public AddressComplex read(Integer id);
    public void update(AddressComplex address);
    public void delete(AddressComplex address);
}
