package org.example.Weapons;

import java.util.Random;

public class Bow extends Weapon {

    private int range;

    public Bow(int pointOfDamage, int range) {
        super(pointOfDamage);
        this.range = range;
    }

    @Override
    public int damage() {
        return new Random().nextInt(0, pointOfDamage);
    }

    public int getRange() {
        return range;
    }

    @Override
    public String toString() {
        return "Bow " +
                "range=" + range +
                ", Damage=" + pointOfDamage +
                ' ';
    }
}
