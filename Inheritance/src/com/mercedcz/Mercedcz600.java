package com.mercedcz;

import com.base.Car;

public class Mercedcz600 extends Car {
    boolean hasMassageSiting;
    boolean hasSunroof;

    public Mercedcz600(int cc, int wheels, String color, boolean hasMassageSiting, boolean hasSunroof) {
        super(cc, wheels, color);
        this.hasMassageSiting = hasMassageSiting;
        this.hasSunroof = hasSunroof;

    }

    public boolean isHasMassageSiting() {
        return hasMassageSiting;
    }

    public void setHasMassageSiting(boolean hasMassageSiting) {
        this.hasMassageSiting = hasMassageSiting;
    }

    public boolean isHasSunroof() {
        return hasSunroof;
    }

    public void setHasSunroof(boolean hasSunroof) {
        this.hasSunroof = hasSunroof;
    }
    @Override
    public String toString() {
        return "Mercedcz600{" +
                "hasMassageSiting=" + hasMassageSiting +
                ", hasSunroof=" + hasSunroof +
                '}' + super.toString();
    }
}