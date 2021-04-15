package ru.java.lambda;

public class Light implements Electricity {

    public void lightOn(){

        System.out.println("Свет включен");
    }

    @Override
    public void electricityOn() {
        lightOn();
    }
}
