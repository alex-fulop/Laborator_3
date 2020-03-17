package com.company.problema3;

public class Car {
    protected String model;
    protected int mileage;

    public Car(String model, int mileage){
        this.model = model;
        this.mileage = mileage;
    }

    public String getModel(){
        return this.model;
    }

    public int getMileage(){
        return this.mileage;
    }
}
