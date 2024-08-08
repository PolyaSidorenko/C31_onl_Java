package Lessons;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 1");
        System.out.println("Введите данные: ");
        int a = input.nextInt();
        if (a % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }

    public static void task2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 2");
        System.out.println("Введите данные: ");
        int a = input.nextInt();
        if (a > -5) {
            System.out.println("Warm");
        } else if (a > -20) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }
    }

    public static void task3() {
        int number = 10;
        System.out.println("Задача 3");
        while (number < 21) {
            int number1 = number * number;
            System.out.println(number1);
            number++;
        }
    }

    public static void task4() {
        int number = 7;
        System.out.println("Задача 4");
        while (number < 99) {
            System.out.println(number);
            number = number + 7;
        }
    }

    public static void task5() {
        Scanner input = new Scanner(System.in);
        System.out.println("Задача 5");
        System.out.println("Введите данные: ");
        int a = input.nextInt();
        int sum = 0;
        if (a < 0) {
            System.out.println("Введите положительное число");
            System.out.println("Введите данные: ");
            a = input.nextInt();
            for (int i = 1; i <= a; i++) {
                sum = sum + i;
            }
            System.out.println(sum);
        } else {
            for (int i = 1; i <= a; i++) {
                sum = sum + i;
            }
            System.out.println(sum);
        }
    }
}