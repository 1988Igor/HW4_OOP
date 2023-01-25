package org.example;

import org.example.Weapons.Shield;

public class Swordman<T extends Shield> extends Warrior {


    public Swordman(String name, int healtPoint, Weaponable weapon, T shield) {
        super(name, healtPoint, weapon, shield);
    }


    @Override
    public String toString() {
        return "Swordman " + super.toString();
    }
}
