package home.bosses;

import home.monsters.Monster;

public class Pharaoh extends Monster {

    public Pharaoh(String name, Integer health, Integer attack) {
        super(name, health, attack);
    }

    @Override
    public Integer useSkill() {

        Integer dmg = super.getAttack();
        double power = dmg * 1.5;
        dmg = (int) power;
        System.out.println("Босс призиває піщану бурю.");
        return dmg;

    }
}
