package com.mik.service.impl;

import com.mik.dao.PhoneDao;
import com.mik.model.Phone;
import com.mik.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mikitjuk on 06.10.15.
 */
@Service("phoneService")
@Transactional("transactionManagerMySQL")
public class PhoneServiceImpl implements PhoneService{

    @Autowired
    private PhoneDao phoneDao;

    @Override
    public void create(Phone phone) {
        phoneDao.create(phone);
    }

    @Override
    public Phone read(Integer id) {
        return null;
    }

    @Override
    public void update(Phone phone) {

    }

    @Override
    public void delete(Phone phone) {

    }

    @Override
    public List getListAll() {
        return null;
    }
}
