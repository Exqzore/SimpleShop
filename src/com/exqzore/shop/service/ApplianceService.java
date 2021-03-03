package com.exqzore.shop.service;

import com.exqzore.shop.entity.Appliance;
import com.exqzore.shop.entity.criteria.Criteria;
import com.exqzore.shop.exception.ServiceException;

import java.util.List;

public interface ApplianceService {
    List<Appliance> findByCategory(String name) throws ServiceException;

    List<Appliance> find(Criteria criteria) throws ServiceException;
}
