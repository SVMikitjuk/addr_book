package com.mik.dao.helper;

import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

public interface GenericDAO<T, PK extends Serializable> {

    @Transactional
    PK create(T newInstance);

    @Transactional
    T read(PK id);

    @Transactional
    void update(T transientObject);

    @Transactional
    void delete(T persistentObject);

    Session getSession();

}
