package ru.java.lambda;

import java.util.ArrayList;
import java.util.List;

public class Button {

    private List<Electricity> listeners= new ArrayList<>();

    public void addElectricity(Electricity listener){
        listeners.add(listener);
    }
    public void removeElectricity(Electricity listener){
        listeners.remove(listener);
    }

    public void buttonOn(){

        System.out.println("Кнопка нажата");

        for (Electricity c : listeners){
            c.electricityOn();
        }
    }
}
