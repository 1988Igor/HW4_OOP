package org.example.Weapons;

import java.util.Random;

public class DefenseShields {
    private final String typeOfShields;
    private int hardness;

    public DefenseShields(String typeOfShields, int hardness) {
        this.typeOfShields = typeOfShields;
        this.hardness = hardness;
    }




    @Override
    public String toString() {
        return "Shield " +
                "typeOfShields= '" + typeOfShields + '\'' +
                ", hardness= " + hardness +
                '}';
    }
}
