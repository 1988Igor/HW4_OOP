package org.example.Weapons;

import org.example.Weaponable;

import java.util.Random;

public class Sword extends Weapon {

    public Sword(int pointOfDamage) {
        super(pointOfDamage);
    }

    @Override
    public int damage() {

        return new Random().nextInt(0,pointOfDamage);
    }

    @Override
    public String toString() {
        return "Sword damage =  " + pointOfDamage;
    }
}
