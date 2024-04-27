package org.example;
import java.util.HashMap;
import java.util.Map;

public class Graveyard {
    private Map<Integer, String> graves;
    private int totalGraves;

    public Graveyard() {
        this.graves = new HashMap<>();
        this.totalGraves = 300;
    }

    public void addGrave(int graveNumber, String occupant) {
        graves.put(graveNumber, occupant);
        totalGraves++;
    }

    public int getTotalGraves() {
        return totalGraves;
    }
}

