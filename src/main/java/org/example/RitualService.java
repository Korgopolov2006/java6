package org.example;

public class RitualService {
    private String name;
    private int price;

    public RitualService(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
