package threadsHome;


import java.util.Scanner;

public class MyThread extends Thread {

    private Scanner scn = new Scanner(System.in);
    private int a = 1;
    private int b = 1;
    private int c;


    @Override
    public void run() {
        System.out.println("Скільки чисел Фібоначчі вивести?");
        int ask = scn.nextInt();
        System.out.println("Потік Thread: ");
        System.out.print(a + " " + b + " ");

        for (int i = 3; i < ask + 1; i++) {


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;

        }
        System.out.println();
    }

}

