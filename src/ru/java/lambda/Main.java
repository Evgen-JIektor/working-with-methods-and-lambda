package ru.java.lambda;

public class Main {
    public static void main(String[] args) {

        Button button = new Button();
        Light light = new Light();
        Television television = new Television();

        button.addElectricity(light);
        button.addElectricity(television);

        button.addElectricity( () -> System.out.println("Работа электросети"));

        button.buttonOn();
    }
}
