package com.mik.dao.iml;

import com.mik.dao.AddressComplexDao;
import com.mik.model.AddressComplex;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mikitjuk on 06.10.15.
 */
@Repository
@Transactional("transactionManagerMySQL")
public class AddressComplexDaoImpl implements AddressComplexDao {


    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void create(AddressComplex address) {
        sessionFactory.getCurrentSession().save(address);
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
