package home;

import home.bosses.BlackWidow;
import home.bosses.Frankenstein;
import home.bosses.Pharaoh;
import home.heroes.Assasin;
import home.heroes.Hero;
import home.heroes.Warrior;
import home.heroes.Wizard;
import home.monsters.Monster;
import home.monsters.Scorpion;
import home.monsters.Spider;
import home.monsters.Zombie;

import java.io.*;
import java.util.*;

public class Menu {

    public Menu() {
        firstLevel();
        secondLevel();
        thirdLevel();
        logo();
    }



    public void logo(){
        System.out.println("╔═══╗╔═══╗╔═══╗     ╔═══╗╔═══╗╔═╗╔═╗╔═══╗");
        System.out.println("║╔═╗║║╔═╗║║╔═╗║     ║╔═╗║║╔═╗║║║╚╝║║║╔══╝");
        System.out.println("║╚═╝║║╚═╝║║║─╚╝     ║║─╚╝║║─║║║╔╗╔╗║║╚══╗");
        System.out.println("║╔╗╔╝║╔══╝║║╔═╗     ║║╔═╗║╚═╝║║║║║║║║╔══╝");
        System.out.println("║║║╚╗║║───║╚╩═║     ║╚╩═║║╔═╗║║║║║║║║╚══╗");
        System.out.println("╚╝╚═╝╚╝───╚═══╝     ╚═══╝╚╝─╚╝╚╝╚╝╚╝╚═══╝");
    }
    public void pressMenu(){
        Scanner scn = new Scanner(System.in);
        System.out.println("        1.Почати пригоди.");
        System.out.println("      2.Загрузити збереження.");
        System.out.println("            3.Вийти.");
        System.out.print("Виберіть пункт: ");
        try {
            switch (scn.nextInt()) {
                case 1:
                    input(firstLevel(), secondLevel(), thirdLevel());
                    break;
                case 2:
                    loadGame();
                    break;
                case 3:
                    break;
            }
        }catch (IOException e){
            System.out.println(e);
        }

    }

    public void input(Map<Integer, Monster> locationMonsters, Map<Integer, Monster> secondLvl, Map<Integer, Monster> thirdLvl) throws IOException {

        Location spiderForest = new Location("Spider forest", locationMonsters);
        Location cemetery = new Location("Cemetery", secondLvl);
        Location desert = new Location("Desert", thirdLvl);

        Scanner scn = new Scanner(System.in);
        System.out.println();
        System.out.println("      Виберіть вашого героя:");
        System.out.println("            1.Воїн.\n" +
                           "            2.Маг.\n" +
                           "            3.Вбивця.");
        System.out.print("Виберіть пункт: ");
        switch (scn.nextInt()) {
            case 1:
                System.out.println();
                System.out.println("Введіть ім'я воїна");
                Hero warrior = new Warrior(scn.next(), 100, 13);
                flLogo();
                spiderForest.battlefield(warrior);
                if (warrior.getHealth() > 0) {
                    slLogo();
                    cemetery.battlefield(warrior);
                    if (warrior.getHealth() > 0) {
                        tlLogo();
                        desert.battlefield(warrior);
                    }
                }
                System.out.println("Хочете зберегти героя?\n1.Так.\n2.Ні");
                switch (scn.nextInt()){
                    case 1:
                        saveGame(warrior);
                }
                break;
            case 2:
                System.out.println("Введіть ім'я мага");
                Hero wizard = new Wizard(scn.next(),100,17);
                flLogo();
                spiderForest.battlefield(wizard);
                if (wizard.getHealth() > 0) {
                    slLogo();
                    cemetery.battlefield(wizard);
                    if (wizard.getHealth() > 0) {
                        tlLogo();
                        desert.battlefield(wizard);
                    }
                }
                System.out.println("Хочете зберегти героя?\n1.Так.\n2.Ні");
                switch (scn.nextInt()){
                    case 1:
                        saveGame(wizard);
                }
                break;
            case 3:
                System.out.println("Введіть ім'я вбивці");
                Hero assasin = new Assasin(scn.next(),80,32);
                flLogo();
                spiderForest.battlefield(assasin);
                if (assasin.getHealth() > 0) {
                    slLogo();
                    cemetery.battlefield(assasin);
                    if (assasin.getHealth() > 0) {
                        tlLogo();
                        desert.battlefield(assasin);
                    }
                }
                System.out.println("Хочете зберегти героя?\n1.Так.\n2.Ні");
                switch (scn.nextInt()){
                    case 1:
                        saveGame(assasin);
                }
                break;
        }

    }

    public void saveGame(Hero hero) throws IOException {
        List<String> list = new ArrayList<>();
        try (Writer writer = new BufferedWriter(new FileWriter("heroes.txt"))) {
            for (String s : list) {
                writer.write(s);
                ((BufferedWriter) writer).newLine();
            }
            writer.write(hero.getName());
        }

    }

    public void loadGame() throws IOException {
        List<String> list = new ArrayList<>();
        try (Reader reader = new BufferedReader(new FileReader("heroes.txt"))) {
            String s;
            while ((s = ((BufferedReader) reader).readLine()) != null) {
                list.add(s);
                System.out.println(s);
            }

        }
    }


    public Map firstLevel(){
        Monster spider = new Spider("Spider", 50, 4);
        Monster scorpion = new Scorpion("Scorpion", 45, 6);
        Monster zombie = new Zombie("Zombie", 60, 5);
        Monster blackWidow = new BlackWidow("Black Widow",60,18);

        Map<Integer, Monster> locationMonsters = new HashMap<>();
        locationMonsters.put(1, spider);
        locationMonsters.put(2, scorpion);
        locationMonsters.put(3, zombie);
        locationMonsters.put(4, blackWidow);

        return locationMonsters;

    }
    public Map secondLevel(){

        Monster spider = new Spider("Spider", 50, 4);
        Monster scorpion = new Scorpion("Scorpion", 45, 6);
        Monster zombie = new Zombie("Zombie", 60, 5);
        Monster frankenstein = new Frankenstein("Frankenstein", 80,10);

        Map<Integer, Monster> secondLvl = new HashMap<>();
        secondLvl.put(1, spider);
        secondLvl.put(2, scorpion);
        secondLvl.put(3, zombie);
        secondLvl.put(4, frankenstein);
        return secondLvl;

    }

    public Map thirdLevel(){
        Monster spider = new Spider("Spider", 50, 4);
        Monster scorpion = new Scorpion("Scorpion", 45, 6);
        Monster zombie = new Zombie("Zombie", 60, 5);
        Monster pharaoh = new Pharaoh("Pharaoh", 70, 12);

        Map<Integer, Monster> thirdLvl = new HashMap<>();
        thirdLvl.put(1, spider);
        thirdLvl.put(2, scorpion);
        thirdLvl.put(3, zombie);
        thirdLvl.put(4, pharaoh);
        return thirdLvl;
    }

    public void flLogo(){
        System.out.println("●▬▬▬▬▬▬▬▬▬▬▬▬ஜ۩۞۩ஜ▬▬▬▬▬▬▬▬▬▬▬▬●");
        System.out.println(" ░░░░░░░░░░-ПЕРШИЙ РІВЕНЬ-░░░░░░░░░ ");
        System.out.println("●▬▬▬▬▬▬▬▬▬▬▬▬ஜ۩۞۩ஜ▬▬▬▬▬▬▬▬▬▬▬▬●");
    }
    public void slLogo(){
        System.out.println("●▬▬▬▬▬▬▬▬▬▬▬▬ஜ۩۞۩ஜ▬▬▬▬▬▬▬▬▬▬▬▬●");
        System.out.println("░░░░░░░░░░░-ДРУГИЙ РІВЕНЬ-░░░░░░░░░ ");
        System.out.println("●▬▬▬▬▬▬▬▬▬▬▬▬ஜ۩۞۩ஜ▬▬▬▬▬▬▬▬▬▬▬▬●");
    }
    public void tlLogo(){
        System.out.println("●▬▬▬▬▬▬▬▬▬▬▬▬ஜ۩۞۩ஜ▬▬▬▬▬▬▬▬▬▬▬▬●");
        System.out.println(" ░░░░░░░░░░-ТРЕТІЙ РІВЕНЬ-░░░░░░░░░ ");
        System.out.println("●▬▬▬▬▬▬▬▬▬▬▬▬ஜ۩۞۩ஜ▬▬▬▬▬▬▬▬▬▬▬▬●");
    }

}
