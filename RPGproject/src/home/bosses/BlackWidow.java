package home.bosses;

import home.monsters.Monster;

public class BlackWidow extends Monster {

    public BlackWidow(String name, Integer health, Integer attack) {
        super(name, health, attack);
    }

    @Override
    public Integer useSkill() {

        Integer dmg = super.getAttack();
        double power = dmg * 0.7;
        dmg = (int) power;
        System.out.println("Босс кусає вас смертельним ядом.");
        return dmg;

    }
}
