package com.pro.java.demo;

public class Car {

    private String sunroofType;

    public Car(String sunroofType) {
        this.sunroofType = sunroofType;
    }

    public Car() {

    }

    public Car getCarWithSunRoof(String sunroofType)
    {

        return new Car(sunroofType);
    }

    public Car getCarWithoutSunRoof()
    {
        return new Car();
    }
}
