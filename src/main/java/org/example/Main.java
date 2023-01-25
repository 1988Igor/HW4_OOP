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
        team1.addWarriorToTeam(new Swordman("Jack", 50, new Sword(10),new DefenseShields("Iron",  2)))
                .addWarriorToTeam(new Swordman("Bruce", 100, new Sword(50),new DefenseShields("Iron",  5)))
                .addWarriorToTeam(new Swordman("Bruce", 100, new Sword(30),new DefenseShields("Wood", 5)))
                .addWarriorToTeam(new Swordman("Donald", 85, new Sword(30),new DefenseShields("Iron",  5)));
        for (Swordman swordman : team1) {
            System.out.println(swordman);

        }
        System.out.println("----------------------------");
        Team<Archer> team2 = new Team<>();
        team2.addWarriorToTeam(new Archer("Igor", 20, new Bow(50, 10), new DefenseShields("Wood", 3)))
                .addWarriorToTeam(new Archer("Roman", 100, new Bow(30, 20), new DefenseShields("Wood", 4)))
                .addWarriorToTeam(new Archer("Rico", 10, new Bow(20, 15), new DefenseShields("Wood", 4)));
        for (Archer archer : team2) {
            System.out.println(archer);

        }


    }

}