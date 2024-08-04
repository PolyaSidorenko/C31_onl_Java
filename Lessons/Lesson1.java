package Lessons;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Задача 1: " + task1(2, 3));
        System.out.println("Задача 2: " + task2(26));
        System.out.println("Задача 3: " + task3(126));
        System.out.println("Задача 4: " + task4(12.6));
        System.out.println(task5(21, 8));
        task6(1, 3);
        task6_1(1, 3);
    }

    public static int task1(int b, int c) {
        int a = 4 * (b + c - 1) / 2;
        return a;
    }

    public static int task2(int n) {
        int a = n / 10;
        int b = n % 10;
        n = a + b;
        return n;
    }

    public static int task3(int n) {
        int a = n / 100;
        int b = (n - a * 100) / 10;
        int c = n % 10;
        n = a + b + c;
        return n;
    }

    public static int task4(double n) {
        int a = (int) (n + 0.5);
        return a;
    }

    public static String task5(int q, int w) {
        int a = q / w;
        int b = q % w;
        return "Задача 5: " + q + " / " + w + " = " + a + " и " + b + " в остатке";
    }

    public static void task6(int a, int b) {
        int c = a;
        a = b;
        b = c;
        System.out.println("Задача 6: ");
        System.out.println(a);
        System.out.println(b);
    }

    public static void task6_1(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Задача 6_1: ");
        System.out.println(a);
        System.out.println(b);
    }

}