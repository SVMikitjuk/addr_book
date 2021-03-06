package com.mik.dao;

import com.mik.model.Phone;

import java.util.List;

/**
 * Created by mikitjuk on 30.09.15.
 */
public interface PhoneDao {
    public void create(Phone phone);
    public Phone read(Integer id);
    public void update(Phone phone);
    public void delete(Phone phone);
    public List getListAll();

}
