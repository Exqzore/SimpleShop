package com.exqzore.shop.factory;

import com.exqzore.shop.entity.Appliance;
import com.exqzore.shop.factory.impl.*;

import java.util.Locale;
import java.util.Map;

public enum FactoryProvider implements Factory<Appliance> {
    OVEN(new FactoryOvenImpl()),
    KETTLE(new FactoryKettleImpl()),
    LAPTOP(new FactoryLaptopImpl()),
    REFRIGERATOR(new FactoryRefrigeratorImpl()),
    VACUUMCLEANER(new FactoryVacuumCleanerImpl()),
    TABLETPC(new FactoryTabletPCImpl()),
    SPEAKERS(new FactorySpeakersImpl());

    private final Factory<? extends Appliance> factory;

    FactoryProvider(Factory<? extends Appliance> factory) {
        this.factory = factory;
    }

    @Override
    public Appliance create(Map<String, String> parameters) {
        return factory.create(parameters);
    }

    public static Factory<Appliance> takeFactory(String name) {
        return valueOf(name.toUpperCase(Locale.ROOT));
    }
}
