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

    int maxHitPoints = 10;
    int currentLevel = 1;

    public Player() {
        hitPoints = 10;
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
    
    public void rest() {
        hitPoints = maxHitPoints;
    }
    
    public void levelUp() {
        currentLevel++;
        maxHitPoints += 1;
        hitPoints += 1;
        attackPower += 1;
        dodgeChance += 1;
        
        if (dodgeChance > 35) {
            dodgeChance = 35;
        }
    }
    
    public int getCurrentLevel() {
        return currentLevel;
    }
}