package Lesson20;

import java.util.Arrays;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));

        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int max = Arrays.stream(array).max().getAsInt();
                System.out.println("Максимальное число в массиве: " + max);
            }
        });

        Thread myThreadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                int min = Arrays.stream(array).min().getAsInt();
                System.out.println("Минимальное число в массиве: " + min);
            }
        });

        myThread.start();
        myThreadTwo.start();
    }
}


