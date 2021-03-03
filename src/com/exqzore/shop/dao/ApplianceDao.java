package com.exqzore.shop.dao;

import com.exqzore.shop.entity.Appliance;
import com.exqzore.shop.entity.criteria.Criteria;
import com.exqzore.shop.exception.DaoException;

import java.util.List;

public interface ApplianceDao {
    List<Appliance> findByCategory(String name) throws DaoException;

    List<Appliance> find(Criteria criteria) throws DaoException;
}
