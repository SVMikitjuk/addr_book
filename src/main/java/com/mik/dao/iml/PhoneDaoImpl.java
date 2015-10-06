package com.mik.dao.iml;

import com.mik.dao.PhoneDao;
import com.mik.model.Phone;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mikitjuk on 06.10.15.
 */
@Repository
@Transactional("transactionManagerMySQL")
public class PhoneDaoImpl implements PhoneDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void create(Phone phone) {
        sessionFactory.getCurrentSession().save(phone);
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
