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

        hitPoints = 3;
        attackPower = 2;
        dodgeChance = 0;

        enemyType = enemyTypes[getRandom(enemyTypes.length)];

        for (int i = 0; i < level; i++) {

            switch (getRandom(3)) {
                case 1:
                    hitPoints += 1;
                    break;
                case 2:
                    attackPower += 1;
                    break;
                case 3:
                    if (dodgeChance > 35) {
                        attackPower += 1;
                    } else {
                        dodgeChance += 1;
                    }
                    break;
                default:
                    hitPoints += 2;
            }
        }

        hitPoints += level;
    }

    public String encounterText() {
        return "You have encountered a " + enemyType + ". Attack!";
    }

    public String getEnemyType() {
        return enemyType;
    }
}
