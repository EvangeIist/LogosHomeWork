package home.monsters;

public class Spider extends Monster {

    public Spider(String name, Integer health, Integer attack) {
        super(name, health, attack);
    }


//Липка павутина.
    @Override
    public Integer useSkill() {

        Integer dmg = super.getAttack();
        dmg += 8;
        System.out.println("Вміння ' Липка павутина ' активовано.");
        return dmg;

    }
}
