package com.exqzore.shop.service;

import com.exqzore.shop.service.impl.ApplianceServiceImpl;

public class ServiceProvider {
    private static final ServiceProvider instance = new ServiceProvider();

    private final ApplianceService applianceService = new ApplianceServiceImpl();

    private ServiceProvider() {
    }

    public ApplianceService getApplianceService() {
        return applianceService;
    }

    public static ServiceProvider getInstance() {
        return instance;
    }
}
