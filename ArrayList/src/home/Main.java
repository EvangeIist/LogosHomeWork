package home;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int ask;

        MyArrayList myArrayList = new MyArrayList();
        for (int i = 0; i < 7; i++){
            myArrayList.add(i);
        }
        myArrayList.printCollection();

        System.out.println("==================");

        ask = scn.nextInt();
        myArrayList.get(ask);

        System.out.println("==================");

        ask = scn.nextInt();
        if (myArrayList.contains(ask)){
            System.out.println("Число є в масиві.");
        } else {
            System.out.println("Немає числа.");
        }

        System.out.println("==================");

        myArrayList.sort();


    }
}
