package com.exqzore.shop.factory.impl;

import com.exqzore.shop.entity.Laptop;
import com.exqzore.shop.factory.Factory;

import java.util.Map;

public class FactoryLaptopImpl implements Factory<Laptop> {
    private static final String CPU = "CPU";
    private static final String OS = "OS";
    private static final String MEMORY_ROM = "MEMORY_ROM";
    private static final String BATTERY_CAPACITY = "BATTERY_CAPACITY";
    private static final String DISPLAY_INCHES = "DISPLAY_INCHS";
    private static final String SYSTEM_MEMORY = "WIDTH";
    private static final String PRICE = "PRICE";

    @Override
    public Laptop create(Map<String, String> parameters) {
        Laptop product = new Laptop();
        product.setBatteryCapacity(Float.parseFloat(parameters.get(BATTERY_CAPACITY)));
        product.setCPU(Float.parseFloat(parameters.get(CPU)));
        product.setDisplayInches(Float.parseFloat(parameters.get(DISPLAY_INCHES)));
        product.setMemoryROM(Integer.parseInt(parameters.get(MEMORY_ROM)));
        product.setOS(parameters.get(OS));
        product.setPrice(Float.parseFloat(parameters.get(PRICE)));
        product.setSystemMemory(Integer.parseInt(parameters.get(SYSTEM_MEMORY)));
        return product;
    }
}
