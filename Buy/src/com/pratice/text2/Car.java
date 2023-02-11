package com.pratice.text2;

public class Car {
    private String carBrand;
    private double carPrice;
    private String carColor;

    public Car() {
    }
    public Car(String carBrand, double carPrice, String carColor) {
        this.carBrand = carBrand;
        this.carColor = carColor;
        this.carPrice = carPrice;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
    public String getCarBrand() {
        return  carBrand;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }
    public double getCarPrice() {
        return carPrice;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
    public String getCarColor() {
        return carColor;
    }
}
