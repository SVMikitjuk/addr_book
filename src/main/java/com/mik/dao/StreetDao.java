package com.mik.dao;

import com.mik.dao.helper.GenericDAO;
import com.mik.model.Street;

import java.util.List;

/**
 * Created by mikitjuk on 30.09.15.
 */
public interface StreetDao extends GenericDAO<Street, Integer> {
    public List<Street> listll();

}
