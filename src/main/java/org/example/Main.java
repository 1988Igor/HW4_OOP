package org.example;

import org.example.Weapons.*;

import java.util.Random;

/*Реализовать абстрактный класс Warrior, с полями name, weapon, healthPoint
 Создать интерфейс Weapon с методом damage(), который будет показывать наносимый урон
 На основе класса Warrior создать различные типы воинов, например, лучник, меченосец, ополченец и т.п. У лучника
 добавить поле расстояние поражения.
 Создать различные виды вооружения, например, меч, лук, лопата. Обеспечить, чтобы определенный тип воина мог
 нести только определенной оружие
 Создать класс командира*/
public class Main {
    public static void main(String[] args) {
        Team<Swordman> team1 = new Team<>();

        Shield woodenShield = new WoodenShield();
        Shield ironShield = new IronShield();

        team1.addWarriorToTeam(new Swordman("Jack", 50, new Sword(10), woodenShield))
                .addWarriorToTeam(new Swordman("Bruce", 100, new Sword(50), ironShield))
                .addWarriorToTeam(new Swordman("Bruce", 100, new Sword(30),woodenShield))
                .addWarriorToTeam(new Swordman("Donald", 85, new Sword(30),ironShield));
        for (Swordman swordman : team1) {
            System.out.println(swordman);

        }
        System.out.println("----------------------------");

        System.out.println("Minimum shield protection in team1 is: " +
                team1.getMinShield().getProtection());

        System.out.println("----------------------------");
        Team<Archer> team2 = new Team<>();
        team2.addWarriorToTeam(new Archer("Igor", 20, new Bow(50, 10),woodenShield))
                .addWarriorToTeam(new Archer("Roman", 100, new Bow(30, 20), ironShield))
                .addWarriorToTeam(new Archer("Rico", 10, new Bow(20, 15), woodenShield));
        for (Archer archer : team2) {
            System.out.println(archer);

        }
        System.out.println("----------------------------");

        System.out.println("Minimum shield protection in team2 is: " +
                team2.getMinShield().getProtection());
    }

}