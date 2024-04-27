package org.example;

public class InventoryItem {
    private String name;
    private int count;

    public InventoryItem(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }
}

