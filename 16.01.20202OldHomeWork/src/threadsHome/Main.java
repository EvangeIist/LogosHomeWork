package threadsHome;

public class Main {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        RunnableThread runnableThread = new RunnableThread();
        runnableThread.run();
    }

}
