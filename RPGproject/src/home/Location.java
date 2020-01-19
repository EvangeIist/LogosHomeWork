package home;

import home.heroes.Hero;
import home.monsters.Monster;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Location {

    private String name;
    private Map<Integer, Monster> monsterMap = new HashMap<>();
    private Integer addToMonsterHP = 0;
    private Integer addToMonsterAttack = 0;
    private Integer addToHeroHP = 0;
    private Integer addToHeroPower = 0;

    public Location(String name, Map<Integer, Monster> monsterMap, Integer addToMonsterHP, Integer addToMonsterAttack, Integer addToHeroHP, Integer addToHeroPower) {
        this.name = name;
        this.monsterMap = monsterMap;
        this.addToMonsterHP = addToMonsterHP;
        this.addToMonsterAttack = addToMonsterAttack;
        this.addToHeroHP = addToHeroHP;
        this.addToHeroPower = addToHeroPower;
    }

    public Location(String name, Map<Integer, Monster> monsterMap) {
        this.name = name;
        this.monsterMap = monsterMap;
    }

    public void battlefield(Hero hero){
        Scanner scn = new Scanner(System.in);
        int count = 0;
        Set<Integer> integers = this.monsterMap.keySet();
        for (Integer level : integers) {
            Monster monster = this.monsterMap.get(level);
            Fighting fighting = new Fighting();
            while (monster.getHealth() > 0 && hero.getHealth() > 0) {
                Integer skill;
                count++;
                System.out.println("▒▒ 1.Удар. ▒▒▒▒▒▒ 2.Уміння. ▒▒");
                switch (scn.nextInt()) {
                    case 1:
                        fighting.fight(hero, monster);
                        break;
                    case 2:
                        if (count % 3 == 0) {
                            skill = hero.useSkill(monster);
                            Integer herohealth = hero.getHealth();
                            herohealth -= monster.getAttack();
                            Integer monsterHealth = monster.getHealth();
                            monsterHealth -= skill;
                            monster.setHealth(monsterHealth);
                            hero.setHealth(herohealth);
                        } else {
                            System.out.println("Уміння заряджається.");
                        }
                            break;
                    default:
                        System.out.println("Виберіть тип удару.");

                }
                System.out.println("▌▌▌▌" + hero.getName() + "▌▌▌▌" + " HP:");
                for (int i = 0; i < (hero.getHealth())/4; i++) {
                    System.out.print((char)152);
                }
                System.out.println(" " + hero.getHealth());
                System.out.println();
                System.out.println("▌▌▌▌" + monster.getName() + "▌▌▌▌" + " HP:");
                for (int i = 0; i < (monster.getHealth())/4; i++) {
                    System.out.print((char)152);
                }
                System.out.println(" " + monster.getHealth());
                System.out.println();
                System.out.println("Ви нанесли " + hero.getAttack() + " одиниць шкоди.");
                System.out.println(monster.getName() + " наність вам " + monster.getAttack() + " одиниць шкоди.");
                System.out.println("─────────────────────────────────────────────\n" +
                                   "╔═╦═╗╔═╦═╗╔═╦═╗╔═╦═╗╔═╦═╗╔═╦═╗╔═╦═╗╔═╦═╗╔═╦═╗\n" +
                                   "╚╗║╔╝╚╗║╔╝╚╗║╔╝╚╗║╔╝╚╗║╔╝╚╗║╔╝╚╗║╔╝╚╗║╔╝╚╗║╔╝\n" +
                                   "─╚═╝──╚═╝──╚═╝──╚═╝──╚═╝──╚═╝──╚═╝──╚═╝──╚═╝─");
                System.out.println();
            }
            System.out.println("Ворог переможений!");
        }
    }

}
