package org.example;

import org.example.Weapons.Shield;
import org.example.Weapons.Sword;

public abstract class Warrior<T extends Shield> {
    private String name;
    private int healtPoint;
    private Weaponable weapon;
    private T shield;


    public Warrior(String name, int healtPoint, Weaponable weapon, T shield) {
        this.name = name;
        this.healtPoint = healtPoint;
        this.weapon = weapon;
        this.shield = shield;

    }

    public Warrior(String name, int healtPoint, Sword sword) {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealtPoint() {
        return healtPoint;
    }

    public void setHealtPoint(int healtPoint) {
        this.healtPoint = healtPoint;
    }

    public Weaponable getWeapon() {
        return weapon;
    }

    public void setWeapon(Weaponable weapon) {
        this.weapon = weapon;
    }

    public T getShield() {
        return shield;
    }

    @Override
    public String toString() {
        return "Warrior /" +
                "name='" + name + '\'' +
                ", healtPoint= " + healtPoint +
                ", weapon= " + weapon + " type of shield= " + shield
                ;
    }
}
