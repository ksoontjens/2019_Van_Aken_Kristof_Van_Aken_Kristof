/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Kristof
 */
public class Enemy extends Entity {

    String[] enemyTypes = {
        "Goblin",
        "Hobgoblin",
        "Bandit",
        "Naga",
        "Boar",
        "Bear",
        "Wizard",
        "Zombie",
        "Werewolf"
    };
    String enemyType;

    public Enemy(int level) {

        hitPoints = 10;
        attackPower = 5;
        dodgeChance = 5;

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
                default:
                    hitPoints += 3;
            }
        }
    }

    public String encounterText() {
        return "You have encountered a " + enemyType + ". Attack!";
    }
    
    public String getEnemyType() {
        return enemyType;
    }
}
