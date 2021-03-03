package com.exqzore.shop.entity;

import java.util.Objects;

public abstract class Appliance {
    private float price;

    public Appliance() {
    }

    public Appliance(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Appliance appliance = (Appliance) o;
        return Float.compare(appliance.price, price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Appliance{");
        sb.append("price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
