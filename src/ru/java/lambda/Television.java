package ru.java.lambda;

public class Television implements Electricity{

    public void televisionOn(){

        System.out.println("телевизор включен");
    }

    @Override
    public void electricityOn() {
        televisionOn();
    }
}
