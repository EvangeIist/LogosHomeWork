package home.inventory;

import home.heroes.Hero;

public class Pants extends Equipment {
    public Pants(Integer hp, Integer atk) {
        super(hp, atk);
    }

    @Override
    public Integer addToHp(Hero hero) {
        int addedHp = hero.getHealth();
        addedHp += getHp();
        return addedHp;
    }

    @Override
    public Integer addToAttack(Hero hero) {
        int addedAttack = hero.getAttack();
        addedAttack += getAtk();
        return addedAttack;
    }
}
