package com.mik.service;

import com.mik.model.Phone;

import java.util.List;

/**
 * Created by mikitjuk on 06.10.15.
 */
public interface PhoneService {
    public void create(Phone phone);
    public Phone read(Integer id);
    public void update(Phone phone);
    public void delete(Phone phone);
    public List getListAll();
}
