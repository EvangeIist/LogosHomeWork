package home.heroes;

import home.monsters.Monster;

public class Assasin extends Hero {

    public Assasin(String name, Integer health, Integer attack) {
        super(name, health, attack);
    }


//Ваміризм
    @Override
    public Integer useSkill(Monster monster) {

        Integer healthAssasin = super.getHealth();
        double vampirism = getAttack() * 0.1;
        healthAssasin = healthAssasin + (int) vampirism;
        System.out.println("Вміння ' Вампіризм ' активовано.");
        return healthAssasin;

    }
}
