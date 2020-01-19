package home.monsters;

public class Scorpion extends Monster {

    public Scorpion(String name, Integer health, Integer attack) {
        super(name, health, attack);
    }


//Отруїне жало.
    @Override
    public Integer useSkill() {

        Integer dmg = super.getAttack();
        dmg += 9;
        System.out.println("Вміння ' Отруїне жало ' активовано.");
        return dmg;


    }
}
