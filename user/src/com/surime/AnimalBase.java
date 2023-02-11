package com.surime;

public class AnimalBase {
    private String animalName;
    private String animalFoodType;
    private int animalAge;

    public AnimalBase(){

    }

    public AnimalBase(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalFoodType() {
        return animalFoodType;
    }

    public void setAnimalFoodType(String animalFoodType) {
        this.animalFoodType = animalFoodType;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }



}
