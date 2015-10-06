package com.mik.service.impl;


import com.mik.dao.AddressComplexDao;
import com.mik.model.AddressComplex;
import com.mik.service.AddressComplexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mikitjuk on 06.10.15.
 */
@Service("adressComplexService")
@Transactional("transactionManagerMySQL")
public class AddressComplexImpl implements AddressComplexService {

    @Autowired
    private AddressComplexDao addressComplexDao;

    @Override
    public void create(AddressComplex address) {
        addressComplexDao.create(address);
    }

    @Override
    public AddressComplex read(Integer id) {
        return null;
    }

    @Override
    public void update(AddressComplex address) {

    }

    @Override
    public void delete(AddressComplex address) {

    }
}
