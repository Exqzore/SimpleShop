package com.exqzore.shop.factory.impl;

import com.exqzore.shop.entity.VacuumCleaner;
import com.exqzore.shop.factory.Factory;

import java.util.Map;

public class FactoryVacuumCleanerImpl implements Factory<VacuumCleaner> {
    private static final String CLEANING_WIDTH = "CLEANING_WIDTH";
    private static final String POWER_CONSUMPTION = "POWER_CONSUMPTION";
    private static final String BAG_TYPE = "BAG_TYPE";
    private static final String WAND_TYPE = "WAND_TYPE";
    private static final String FILTER_TYPE = "FILTER_TYPE";
    private static final String MOTOR_SPEED_REGULATION = "MOTOR_SPEED_REGULATION";
    private static final String PRICE = "PRICE";

    @Override
    public VacuumCleaner create(Map<String, String> parameters) {
        VacuumCleaner product = new VacuumCleaner();
        product.setCleaningWidth(Float.parseFloat(parameters.get(CLEANING_WIDTH)));
        product.setWandType(parameters.get(WAND_TYPE));
        product.setFilterType(parameters.get(FILTER_TYPE));
        product.setBagType(parameters.get(BAG_TYPE));
        product.setPowerConsumption(Float.parseFloat(parameters.get(POWER_CONSUMPTION)));
        product.setPrice(Float.parseFloat(parameters.get(PRICE)));
        product.setMotorSpeedRegulation(Float.parseFloat(parameters.get(MOTOR_SPEED_REGULATION)));
        return product;
    }
}
