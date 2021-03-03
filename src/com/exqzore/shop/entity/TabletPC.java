package com.exqzore.shop.entity;

import java.util.Objects;

public class TabletPC extends Appliance {
    private String color;
    private float flashMemoryCapacity;
    private float batteryCapacity;
    private int memoryROM;
    private float displayInches;

    public TabletPC() {
    }

    public TabletPC(float price, String color, float flashMemoryCapacity, float batteryCapacity, int memoryROM, float displayInches) {
        super(price);
        this.color = color;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.batteryCapacity = batteryCapacity;
        this.memoryROM = memoryROM;
        this.displayInches = displayInches;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(float flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public float getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(float batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(int memoryROM) {
        this.memoryROM = memoryROM;
    }

    public float getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(float displayInches) {
        this.displayInches = displayInches;
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
        TabletPC tabletPC = (TabletPC) o;
        return Float.compare(tabletPC.flashMemoryCapacity, flashMemoryCapacity) == 0
                && Float.compare(tabletPC.batteryCapacity, batteryCapacity) == 0
                && memoryROM == tabletPC.memoryROM
                && Float.compare(tabletPC.displayInches, displayInches) == 0
                && Objects.equals(color, tabletPC.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color, flashMemoryCapacity, batteryCapacity, memoryROM, displayInches);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TabletPC{");
        sb.append("price=").append(getPrice());
        sb.append("color='").append(color).append('\'');
        sb.append(", flashMemoryCapacity=").append(flashMemoryCapacity);
        sb.append(", batteryCapacity=").append(batteryCapacity);
        sb.append(", memoryROM=").append(memoryROM);
        sb.append(", displayInches=").append(displayInches);
        sb.append('}');
        return sb.toString();
    }
}
