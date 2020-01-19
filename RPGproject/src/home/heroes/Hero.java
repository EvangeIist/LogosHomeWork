package home.heroes;

import home.monsters.Monster;

public class Hero {

    private String name;
    private Integer health;
    private Integer attack;

    public Hero(String name, Integer health, Integer attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }


    public Integer useSkill(Monster monster){
        return null;
    }

}
