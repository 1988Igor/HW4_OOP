package org.example;

import org.example.Weapons.DefenseShields;
import org.example.Weapons.Sword;

public abstract class Warrior {
  private   String name;
  private  int healtPoint;
  private Weaponable weapon;
  private DefenseShields shields;

  public DefenseShields getShields() {
    return shields;
  }

  public void setShields(DefenseShields shields) {
    this.shields = shields;
  }

  public Warrior(String name, int healtPoint, Weaponable weapon, DefenseShields shields) {
    this.name = name;
    this.healtPoint = healtPoint;
    this.weapon = weapon;



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


  @Override
  public String toString() {
    return "Warrior{" +
            "name='" + name + '\'' +
            ", healtPoint=" + healtPoint +
            ", weapon=" + weapon +
            ", shields=" + shields +
            '}';
  }
}
