package com.exqzore.shop.parser;

import java.util.HashMap;
import java.util.Map;

public class Parser {
    private static final String PRODUCT_NAME_DELIMITER = " : ";
    private static final String PRODUCT_PARAMETERS_DELIMITER = ", ";
    private static final String KEY_VALUE_DELIMITER = "=";

    public String parsName(String line) {
        return line.split(PRODUCT_NAME_DELIMITER)[0];
    }

    public Map<String, String> parsParams(String line) {
        String[] productCharacteristics = line.split(PRODUCT_NAME_DELIMITER);
        Map<String, String> params = new HashMap<>();
        String[] characteristics = productCharacteristics[1].split(PRODUCT_PARAMETERS_DELIMITER);
        for (String characteristic : characteristics) {
            String[] parameter = characteristic.split(KEY_VALUE_DELIMITER);
            params.put(parameter[0], parameter[1]);
        }
        return params;
    }
}
