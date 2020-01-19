package home.heroes;

import home.monsters.Monster;

public class Wizard extends Hero {

    public Wizard(String name, Integer health, Integer attack) {
        super(name, health, attack);
    }


//Захисний бар'єр
    @Override
    public Integer useSkill(Monster monster) {
        double barrier = super.getHealth() * 0.3;
        int dmg;
        Integer healhWizard = super.getHealth();
        System.out.println("Вміння ' Захисний бар'єр ' активовано.");
        if (monster.getAttack() > barrier) {
            dmg = monster.getAttack() - (int) barrier;
            healhWizard -= dmg;
            System.out.println("Бар'єр пробито.");
        }else {
            System.out.println("Бар'єр витримав удар.");
        }
        return healhWizard;
    }
}
