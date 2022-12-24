package com.base;

public class Car {

    int cc;
    int wheels;
    String color;

    public Car(int cc, int wheels, String color) {
        this.cc = cc;
        this.wheels = wheels;
        this.color = color;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "cc=" + cc +
                ", wheels=" + wheels +
                ", color='" + color + '\'' +
                '}';
    }
}