package org.example;

import org.example.Weapons.Bow;
import org.example.Weapons.Shield;

public class Archer<T extends Shield> extends Warrior {

    public Archer(String name, int healtPoint, Bow bow, T shield) {
        super(name, healtPoint, bow, shield);
    }

    @Override
    public String toString() {
        return "Archer " + super.toString();
    }

    public int shootRange() {
        return ((Bow) getWeapon()).getRange();
    }
}




