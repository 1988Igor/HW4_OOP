package org.example;

import org.example.Weapons.Shield;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<E extends Warrior> implements  Iterable<E>{
    private List<E> team = new ArrayList<>();

    public Team <E> addWarriorToTeam(E person){
        team.add(person);
        return this;
    }

    @Override
    public Iterator<E> iterator() {
        return team.iterator();
    }
    public int maxRange(){
        int maxRange = 0;
        for(E item: team ){
            if(item instanceof Archer){
                if(((Archer)item).shootRange() > maxRange) maxRange = ((Archer)item).shootRange();
            }
        }
        return maxRange;
    }
    public Shield getMinShield(){
        Shield minShield = team.get(0).getShield();
        for(E person:team){
            if(person.getShield().getProtection() < minShield.getProtection()) {
                minShield = person.getShield();
            }
        }
        return minShield;
    }
}
