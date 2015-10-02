package com.mik.dao.iml;

import com.mik.dao.AddressDao;
import com.mik.model.Address;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mikitjuk on 02.10.15.
 */
@Repository
@Transactional("transactionManagerMySQL")
public class AddressDaoImpl implements AddressDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void create(Address address) {
        sessionFactory.getCurrentSession().save(address);
    }

    @Override
    public Address read(Integer id) {
        return (Address) sessionFactory.getCurrentSession().get(Address.class, id);
    }

    @Override
    public void update(Address address) {
        sessionFactory.getCurrentSession().update(address);
    }

    @Override
    public void delete(Address address) {
        sessionFactory.getCurrentSession().delete(address);
    }

    @Override
    public List getListAll() {
        return sessionFactory.getCurrentSession().createQuery("from Address").list();
    }
}
