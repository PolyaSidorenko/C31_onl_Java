package Lesson20;

import java.util.Arrays;
public class TaskTwo {
    public static void main(String[] args) throws InterruptedException {
        int[] array = {7, 9, 4, 8, 11, 6, 1};
        Thread myThreadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int left = 0; left < array.length; left++) {
                    int value = array[left];
                    int i = left - 1;
                    for (; i >= 0; i--) {
                        if (value < array[i]) {
                            array[i + 1] = array[i];
                        } else {
                            break;
                        }
                    }
                    array[i + 1] = value;
                }
                System.out.println("Сортировка вставками: " + Arrays.toString(array));
            }
        });

        Thread myThreadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < array.length; i++) {
                    int pos = i;
                    int min = array[i];
                    for (int j = i + 1; j < array.length; j++) {
                        if (array[j] < min) {
                            pos = j;
                            min = array[j];
                        }
                    }
                    array[pos] = array[i];
                    array[i] = min;
                }
                System.out.println("Сортировка выборором: " + Arrays.toString(array));
            }
        });

        Thread myThreadThree = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < array.length - 1; i++) {
                    for(int j = 0; j < array.length - i - 1; j++) {
                        if(array[j + 1] < array[j]) {
                            int swap = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = swap;
                        }
                    }
                }
                System.out.println("Сортировка пузырьком: " + Arrays.toString(array));
            }
        });

        myThreadOne.start();
        myThreadTwo.start();
        myThreadThree.start();
    }
}
