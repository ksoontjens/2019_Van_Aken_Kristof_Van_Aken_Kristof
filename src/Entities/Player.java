/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Kristof
 */
public class Player extends Entity {

    int maxHitPoints = 12;

    public Player() {
        hitPoints = 12;
        attackPower = 3;
        dodgeChance = 10;
    }

    public int getMaxHp() {
        return maxHitPoints;
    }

    public int defend(int damage) {
        if (getRandom(100) > dodgeChance * 2) {
            hitPoints -= damage;
        }

        return hitPoints;
    }
}