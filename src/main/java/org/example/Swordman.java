package org.example;

import org.example.Weapons.DefenseShields;
import org.example.Weapons.Sword;

public class Swordman extends Warrior {




    public Swordman(String name, int healtPoint, Weaponable weapon, DefenseShields shields) {
        super(name, healtPoint, weapon, shields);
    }


    @Override
    public String toString() {
        return "Swordman " + super.toString();
    }
}
