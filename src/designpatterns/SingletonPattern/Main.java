package designpatterns.SingletonPattern;

public class Main implements Runnable {

    @Override
    public void run() {
        DatabaseConnection.getLazyInstance();
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new Main());
        Thread t2 = new Thread(new Main());

        t1.start();
        t2.start();

    }
}
