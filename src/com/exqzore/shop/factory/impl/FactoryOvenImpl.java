package com.exqzore.shop.factory.impl;

import com.exqzore.shop.entity.Oven;
import com.exqzore.shop.factory.Factory;

import java.util.Map;

public class FactoryOvenImpl implements Factory<Oven> {
    private static final String CAPACITY = "CAPACITY";
    private static final String POWER_CONSUMPTION = "POWER_CONSUMPTION";
    private static final String WEIGHT = "WEIGHT";
    private static final String DEPTH = "DEPTH";
    private static final String HEIGHT = "HEIGHT";
    private static final String WIDTH = "WIDTH";
    private static final String PRICE = "PRICE";

    @Override
    public Oven create(Map<String, String> parameters) {
        Oven product = new Oven();
        product.setCapacity(Float.parseFloat(parameters.get(CAPACITY)));
        product.setDepth(Float.parseFloat(parameters.get(DEPTH)));
        product.setHeight(Float.parseFloat(parameters.get(HEIGHT)));
        product.setWeight(Float.parseFloat(parameters.get(WEIGHT)));
        product.setPowerConsumption(Float.parseFloat(parameters.get(POWER_CONSUMPTION)));
        product.setPrice(Float.parseFloat(parameters.get(PRICE)));
        product.setWidth(Float.parseFloat(parameters.get(WIDTH)));
        return product;
    }
}
