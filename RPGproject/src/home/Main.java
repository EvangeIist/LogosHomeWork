package home;

import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) throws InputMismatchException {
        while (true)
        try {

            Menu menu = new Menu();
            menu.pressMenu();
        }catch (InputMismatchException e) {
            System.out.println("ПОМИЛКА!Ви не вибрали пункт.");
        }
    }

}
