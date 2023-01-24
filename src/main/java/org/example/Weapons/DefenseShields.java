package org.example.Weapons;

public class DefenseShields<E> {
    private String typeOfShields;
    private int minShield;

    public DefenseShields(String typeOfShields, int minShield) {
        this.typeOfShields = typeOfShields;
        this.minShield = minShield;
    }

    @Override
    public String toString() {
        return "DefenseShields{" +
                "typeOfShields='" + typeOfShields + '\'' +
                ", minShield=" + minShield +
                '}';
    }
}
