package com.exqzore.shop.service.impl;

import com.exqzore.shop.dao.DaoProvider;
import com.exqzore.shop.entity.Appliance;
import com.exqzore.shop.entity.criteria.Criteria;
import com.exqzore.shop.exception.DaoException;
import com.exqzore.shop.exception.ServiceException;
import com.exqzore.shop.service.ApplianceService;

import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {
    @Override
    public List<Appliance> findByCategory(String name) throws ServiceException {
        List<Appliance> appliances;
        try {
            appliances = DaoProvider.getInstance().getApplianceDAO().findByCategory(name);
        } catch (DaoException exception) {
            //TODO: add logger
            throw new ServiceException(exception);
        }
        return appliances;
    }

    @Override
    public List<Appliance> find(Criteria criteria) throws ServiceException {
        List<Appliance> appliances;
        try {
            appliances = DaoProvider.getInstance().getApplianceDAO().find(criteria);
        } catch (DaoException exception) {
            //TODO: add logger
            throw new ServiceException(exception);
        }
        return appliances;
    }
}
