package home.inventory;

import home.heroes.Hero;

public class Equipment {

    private Integer hp;
    private Integer atk;

    public Equipment(Integer hp, Integer atk) {
        this.hp = hp;
        this.atk = atk;
    }

    public Integer addToHp(Hero hero){
        return null;
    }

    public Integer addToAttack(Hero hero){
        return null;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getAtk() {
        return atk;
    }

    public void setAtk(Integer atk) {
        this.atk = atk;
    }
}
