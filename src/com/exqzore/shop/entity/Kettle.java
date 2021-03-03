package com.exqzore.shop.entity;

import java.util.Objects;

public class Kettle extends Appliance {
    private float powerConsumption;
    private float overallCapacity;
    private float volume;

    public Kettle() {
    }

    public Kettle(float price, float powerConsumption, float overallCapacity, float volume) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.overallCapacity = overallCapacity;
        this.volume = volume;
    }

    public float getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(float powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public float getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(float overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Kettle kettle = (Kettle) o;
        return Float.compare(kettle.powerConsumption, powerConsumption) == 0
                && Float.compare(kettle.overallCapacity, overallCapacity) == 0
                && Float.compare(kettle.volume, volume) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, overallCapacity, volume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Kettle{");
        sb.append("price=").append(getPrice());
        sb.append(", powerConsumption=").append(powerConsumption);
        sb.append(", overallCapacity=").append(overallCapacity);
        sb.append(", volume=").append(volume);
        sb.append('}');
        return sb.toString();
    }
}
