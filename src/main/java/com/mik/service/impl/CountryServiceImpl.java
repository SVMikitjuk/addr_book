package com.mik.service.impl;

import com.mik.dao.CountryDao;
import com.mik.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mikitjuk on 05.10.15.
 */
@Service("countryService")
@Transactional("transactionManagerMySQL")
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryDao countryDao;

    @Override
    public List getList() {
        return countryDao.getList();
    }
}
