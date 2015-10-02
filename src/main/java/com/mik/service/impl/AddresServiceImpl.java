package com.mik.service.impl;

import com.mik.dao.AddressDao;
import com.mik.model.Address;
import com.mik.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mikitjuk on 02.10.15.
 */
@Service
public class AddresServiceImpl implements AddressService {

    @Autowired
    private AddressDao addressDao;

    @Transactional
    public void create(Address address) {
        addressDao.create(address);
    }

    @Transactional
    public Address read(Integer id) {
        return addressDao.read(id);
    }

    @Transactional
    public void update(Address address) {
        addressDao.update(address);
    }

    @Transactional
    public void delete(Address address) {
        addressDao.delete(address);
    }

    @Override
    public List getListAll() {
        return addressDao.getListAll();
    }
}
