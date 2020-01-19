package home;

import home.heroes.Hero;
import home.monsters.Monster;

import java.util.Random;

public class Fighting {

    public void fight(Hero hero, Monster monster) {
        Integer monstersSkill;
        Random random = new Random();
        int randomInt = random.nextInt(100);
        if(randomInt > 30) {
            Integer herohealth = hero.getHealth();
            herohealth -= monster.getAttack();
            Integer monsterHealth = monster.getHealth();
            monsterHealth -= hero.getAttack();
            monster.setHealth(monsterHealth);
            hero.setHealth(herohealth);
        }
        if (randomInt <= 30){
            monstersSkill = monster.useSkill();
            Integer herohealth = hero.getHealth();
            herohealth -= monstersSkill;
            Integer monsterHealth = monster.getHealth();
            monsterHealth -= hero.getAttack();
            monster.setHealth(monsterHealth);
            hero.setHealth(herohealth);
        }
    }

}
