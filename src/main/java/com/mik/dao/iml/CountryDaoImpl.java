package com.mik.dao.iml;/**
 * Created by mikitjuk on 05.10.15.
 */

import com.mik.dao.CountryDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional("transactionManagerMySQL")
public class CountryDaoImpl implements CountryDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List getList() {
        return sessionFactory.getCurrentSession().createQuery("from Country").list();
    }
}
