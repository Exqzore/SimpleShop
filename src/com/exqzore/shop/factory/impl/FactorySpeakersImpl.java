package com.exqzore.shop.factory.impl;

import com.exqzore.shop.entity.Speakers;
import com.exqzore.shop.factory.Factory;

import java.util.Map;

public class FactorySpeakersImpl implements Factory<Speakers> {
    private static final String POWER_CONSUMPTION = "POWER_CONSUMPTION";
    private static final String FREQUENCY_RANGE = "FREQUENCY_RANGE";
    private static final String NUMBER_OF_SPEAKERS = "NUMBER_OF_SPEAKERS";
    private static final String CORD_LENGTH = "CORD_LENGTH";
    private static final String PRICE = "PRICE";

    @Override
    public Speakers create(Map<String, String> parameters) {
        Speakers product = new Speakers();
        product.setFrequencyRange(parameters.get(FREQUENCY_RANGE));
        product.setNumberOfSpeakers(Integer.parseInt(parameters.get(NUMBER_OF_SPEAKERS)));
        product.setCordLength(Float.parseFloat(parameters.get(CORD_LENGTH)));
        product.setPowerConsumption(Float.parseFloat(parameters.get(POWER_CONSUMPTION)));
        product.setPrice(Float.parseFloat(parameters.get(PRICE)));
        return product;
    }
}
