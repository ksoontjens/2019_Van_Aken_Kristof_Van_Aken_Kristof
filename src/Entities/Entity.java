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

    public int attack() {
        return getRandom(attackPower);
    }

    public int takeHit(int damage) {
        if (getRandom(100) > dodgeChance) {
            hitPoints -= getRandom(attackPower);
        }

        return hitPoints;
    }

    public int getCurrentHp() {
        return hitPoints;
    }

    public static int getRandom(int max) {
        return (int) (Math.random() * max);
    }
}
