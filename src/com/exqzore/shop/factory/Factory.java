package com.exqzore.shop.factory;

import java.util.Map;

public interface Factory<T> {
    T create(Map<String, String> parameters);
}
