package com.exqzore.shop.factory.impl;

import com.exqzore.shop.entity.Kettle;
import com.exqzore.shop.factory.Factory;

import java.util.Map;

public class FactoryKettleImpl implements Factory<Kettle> {
    private static final String POWER_CONSUMPTION = "POWER_CONSUMPTION";
    private static final String OVERALL_CAPACITY = "OVERALL_CAPACITY";
    private static final String VOLUME = "VOLUME";
    private static final String PRICE = "PRICE";

    @Override
    public Kettle create(Map<String, String> parameters) {
        Kettle product = new Kettle();
        product.setPowerConsumption(Float.parseFloat(parameters.get(POWER_CONSUMPTION)));
        product.setOverallCapacity(Float.parseFloat(parameters.get(OVERALL_CAPACITY)));
        product.setVolume(Float.parseFloat(parameters.get(VOLUME)));
        product.setPrice(Float.parseFloat(parameters.get(PRICE)));
        return product;
    }
}
