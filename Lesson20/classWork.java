package Lesson20;

public class classWork {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Поток main начинает свою работу");
        Thread thread1 = new Thread(new Child());
        thread1.start();
        thread1.join();
        System.out.println("\nПоток main завершает свою работу");
    }
}
class Counter {
    static int count = 0;
}
class Child implements Runnable{
    public synchronized void increment() {
        Counter.count++;
        System.out.print(Counter.count + " ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            increment();
        }
    }
}
