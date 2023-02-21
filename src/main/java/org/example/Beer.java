package org.example;

public class Beer extends Product{

    double volume;


    public Beer(String name, double cost, double volume) {
        super(name, cost);
        this.volume = volume;

    }

    @Override
    public String toString() {
        return super.toString() + String.format(", объем: %f", volume);
    }
}
