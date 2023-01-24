package org.example;

import org.example.Weapons.Bow;
import org.example.Weapons.DefenseShields;

public class Archer extends Warrior {

    public Archer(String name, int healtPoint, Bow bow, DefenseShields shields) {
        super(name, healtPoint, bow, shields);
    }

    @Override
    public String toString() {
        return "Archer " + super.toString();
    }
    public int shootRange(){
        return((Bow) getWeapon()) .getRange();
    }}



