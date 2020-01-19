package home.monsters;

public class Zombie extends Monster {

    public Zombie(String name, Integer health, Integer attack) {
        super(name, health, attack);
    }
//Поїдання мозгів.
    @Override
    public Integer useSkill() {

        Integer dmg = super.getAttack();
        dmg += 7;
        System.out.println("Вміння ' Поїдання мозгів ' активовано.");
        return dmg;

    }
}
