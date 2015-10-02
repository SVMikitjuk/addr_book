package com.mik.dao.helper;

import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Transactional("transactionManagerMySQL")
public class GenericMySqlDAOImpl<T, PK extends Serializable> implements GenericDAO<T, PK>{

    @Qualifier("sessionFactoryMySQL")
    private SessionFactory sessionFactory;

    private Class<T> type;

    public GenericMySqlDAOImpl(Class<T> type) {
        this.type = type;
    }

    public PK create(T o){
        return (PK) getSession().save(o);
    }

    public T read(PK id) {
        return (T) getSession().get(type, id);
    }

    public void update(T o) {
        getSession().update(o);
    }

    public void delete(T o) {
        getSession().delete(o);
    }

    public Session getSession() {
        Session session = sessionFactory.getCurrentSession();
        session.setFlushMode(FlushMode.AUTO);
        return session;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}
