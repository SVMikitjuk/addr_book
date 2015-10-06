package com.mik.service;

import com.mik.model.AddressComplex;

/**
 * Created by mikitjuk on 06.10.15.
 */
public interface AddressComplexService {
    public void create(AddressComplex address);
    public AddressComplex read(Integer id);
    public void update(AddressComplex address);
    public void delete(AddressComplex address);
}
