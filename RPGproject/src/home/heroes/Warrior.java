package home.heroes;

import home.monsters.Monster;

public class Warrior extends Hero {

    public Warrior(String name, Integer health, Integer attack) {
        super(name, health, attack);
    }


//Збільшений урон.
    @Override
    public Integer useSkill(Monster monster) {

        Integer dmg = super.getAttack();
        double power = dmg * 1.5;
        dmg = (int) power;
        System.out.println("Вміння ' Меч справедливості ' активова.");
        return dmg;

    }
}
