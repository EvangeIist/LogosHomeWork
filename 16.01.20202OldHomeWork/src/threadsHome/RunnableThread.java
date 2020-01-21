package threadsHome;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunnableThread implements Runnable {
    private Scanner scn = new Scanner(System.in);
    private int a = 1; //63245986;
    private int b = 1; //39088169;
    private int c;
    private List arr = new ArrayList();


    @Override
    public void run() {
        System.out.println("Скільки чисел Фібоначчі вивести з кінця?");
        int ask = scn.nextInt();
        System.out.println("Потік Runnable: ");
        arr.add(a);
        arr.add(b);

        for(int i = 3; i < ask; i++){
            c = a + b;
            arr.add(c);
            a = b;
            b = c;
        }

        for (int i = arr.size() - 1; i > 0; i--) {


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            System.out.print(arr.get(i) + " ");
        }
            System.out.println("1");
    }
}
