package com.exqzore.shop.factory.impl;

import com.exqzore.shop.entity.Kettle;
import com.exqzore.shop.entity.Oven;
import com.exqzore.shop.entity.TabletPC;
import com.exqzore.shop.factory.Factory;

import java.util.Map;

public class FactoryTabletPCImpl implements Factory<TabletPC> {
    private static final String POWER_CONSUMPTION = "POWER_CONSUMPTION";
    private static final String COLOR = "COLOR";
    private static final String DISPLAY_INCHES = "DISPLAY_INCHS";
    private static final String MEMORY_ROM = "MEMORY_ROM";
    private static final String BATTERY_CAPACITY = "BATTERY_CAPACITY";
    private static final String PRICE = "PRICE";

    @Override
    public TabletPC create(Map<String, String> parameters) {
        TabletPC product = new TabletPC();
        product.setBatteryCapacity(Float.parseFloat(parameters.get(BATTERY_CAPACITY)));
        product.setDisplayInches(Float.parseFloat(parameters.get(DISPLAY_INCHES)));
        product.setMemoryROM(Integer.parseInt(parameters.get(MEMORY_ROM)));
        product.setColor(parameters.get(COLOR));
        product.setFlashMemoryCapacity(Float.parseFloat(parameters.get(POWER_CONSUMPTION)));
        product.setPrice(Float.parseFloat(parameters.get(PRICE)));
        return product;
    }
}
