package com.exqzore.shop.dao;

import com.exqzore.shop.dao.impl.ApplianceDaoImpl;

public class DaoProvider {
    private static final DaoProvider instance = new DaoProvider();

    private final ApplianceDao applianceDAO = new ApplianceDaoImpl();

    private DaoProvider() {
    }

    public ApplianceDao getApplianceDAO() {
        return applianceDAO;
    }

    public static DaoProvider getInstance() {
        return instance;
    }
}
