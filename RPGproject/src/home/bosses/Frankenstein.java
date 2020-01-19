package home.bosses;

import home.monsters.Monster;

public class Frankenstein extends Monster {

    public Frankenstein(String name, Integer health, Integer attack) {
        super(name, health, attack);
    }

    @Override
    public Integer useSkill() {

        Integer dmg = super.getAttack();
        double power = dmg * 0.4;
        dmg = (int) power;
        System.out.println("Босс вдаряє громом.");
        return dmg;
    }
}
