/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Kristof
 */
public class Enemy {
    String[] enemyTypes = {
        " Goblin",
        " Hobgoblin",
        " Bandit",
        " Naga",
        " Boar",
        " Bear",
        "Wizard",
        "n Adventurer",
        " Zombie",
        " Werewolf"
    };
    
    int hitPoints = 10;
    int attackPower = 2;
    int dodgeChance = 5;
    int critChance = 5;
    String enemyType;

    public Enemy(int level) {
        
        enemyType = enemyTypes[getRandom(enemyTypes.length)];
        
        for (int i = 0; i < level; i++) {

            switch (getRandom(4)) {
                case 1:
                    hitPoints += 2;
                    break;
                case 2:
                    attackPower += 2;
                    break;
                case 3:
                    dodgeChance += 5;
                    break;
                case 4:
                    critChance += 5;
                    break;
                default:
                    hitPoints += 3;
            }
        }
    }
    
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
    
    public String encounterText(){
        return "You have encountered a" + enemyType + ". Attack!";
    }

    public static int getRandom(int max) {
        return (int) (Math.random() * max);
    }
}
