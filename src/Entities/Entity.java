/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Kristof
 */
public class Entity {

    int hitPoints;
    int attackPower;
    int dodgeChance;
    int critChance;

    public int attack() {
        return getRandom(attackPower);
    }

    public int takeHit(int damage) {
        if (getRandom(100) > dodgeChance) {
            if (getRandom(100) > critChance) {
                hitPoints -= getRandom(attackPower) * 2;
            } else {
                hitPoints -= getRandom(attackPower);
            }
        }

        return hitPoints;
    }

    public static int getRandom(int max) {
        return (int) (Math.random() * max);
    }
}
