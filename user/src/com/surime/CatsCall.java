package com.surime;

public class CatsCall implements AnimalCall {
    @Override
    public void animalCall() {
        System.out.println("喵");
    }
}
