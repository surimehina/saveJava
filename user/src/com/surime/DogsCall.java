package com.surime;

public class DogsCall implements AnimalCall {

    @Override
    public void animalCall() {
        System.out.println("汪");
    }
}
