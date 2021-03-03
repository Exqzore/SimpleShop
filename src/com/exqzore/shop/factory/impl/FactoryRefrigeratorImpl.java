package com.exqzore.shop.factory.impl;

import com.exqzore.shop.entity.Refrigerator;
import com.exqzore.shop.factory.Factory;

import java.util.Map;

public class FactoryRefrigeratorImpl implements Factory<Refrigerator> {
    private static final String OVERALL_CAPACITY = "OVERALL_CAPACITY";
    private static final String POWER_CONSUMPTION = "POWER_CONSUMPTION";
    private static final String WEIGHT = "WEIGHT";
    private static final String FREEZER_CAPACITY = "FREEZER_CAPACITY";
    private static final String HEIGHT = "HEIGHT";
    private static final String WIDTH = "WIDTH";
    private static final String PRICE = "PRICE";

    @Override
    public Refrigerator create(Map<String, String> parameters) {
        Refrigerator product = new Refrigerator();
        product.setOverallCapacity(Float.parseFloat(parameters.get(OVERALL_CAPACITY)));
        product.setFreezerCapacity(Float.parseFloat(parameters.get(FREEZER_CAPACITY)));
        product.setHeight(Float.parseFloat(parameters.get(HEIGHT)));
        product.setWeight(Float.parseFloat(parameters.get(WEIGHT)));
        product.setPowerConsumption(Float.parseFloat(parameters.get(POWER_CONSUMPTION)));
        product.setPrice(Float.parseFloat(parameters.get(PRICE)));
        product.setWidth(Float.parseFloat(parameters.get(WIDTH)));
        return product;
    }
}
