package Lessons;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int a = input.nextInt();
        Random r = new Random();
        int[] randomNumber;
        randomNumber = new int[a];
        for (int i = 0; i < randomNumber.length; i++) {
            randomNumber[i] = r.nextInt(20) + 1;
        }
        Arrays.sort(randomNumber);
        System.out.println("В прямом порядке: ");
        for (int i = 0; i < randomNumber.length; i++) {
            System.out.print(randomNumber[i] + "  ");
        }
        System.out.println(" ");
        System.out.println("В обратном порядке: ");
        for (int i = randomNumber.length - 1; i >= 0; i--) {
            System.out.print(randomNumber[i] + "  ");
        }
        System.out.println(" ");
    }

    public static void task2() {
        System.out.println(" ");
        System.out.println("Задача 2");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int a = input.nextInt();
        Random r = new Random();
        int[] maxMinNumber;
        maxMinNumber = new int[a];
        for (int i = 0; i < maxMinNumber.length; i++) {
            maxMinNumber[i] = r.nextInt(20) + 1;
        }
        int max = maxMinNumber[0];
        int min = maxMinNumber[0];
        for (int i = 1; i < maxMinNumber.length; i++) {
            if (maxMinNumber[i] > max) {
                max = maxMinNumber[i];
            } else if (maxMinNumber[i] < min) {
                min = maxMinNumber[i];
            }
        }
        System.out.println("Максимум: " + max);
        System.out.println("Минимум: " + min);
    }

    public static void task3() {
        System.out.println(" ");
        System.out.println("Задача 3");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int a = input.nextInt();
        Random r = new Random();
        int[] maxMinIndex;
        maxMinIndex = new int[a];
        for (int i = 0; i < maxMinIndex.length; i++) {
            maxMinIndex[i] = r.nextInt(20) + 1;
        }
        System.out.println("Значение элементов массива: " + Arrays.toString(maxMinIndex));
        int max1 = maxMinIndex[0];
        int min1 = maxMinIndex[0];
        for (int i = 1; i < maxMinIndex.length; i++) {
            if (maxMinIndex[i] > max1) {
                max1 = maxMinIndex[i];
            } else if (maxMinIndex[i] < min1) {
                min1 = maxMinIndex[i];
            }
        }
        int index;

        for (int i = 0; i <= maxMinIndex.length; i++) {
            if (maxMinIndex[i] == max1) {
                index = i;
                System.out.println("Индекс элемента с максимальным значением: " + index);
                //Здесь я вывожу индексы элемента массива начиная с 0
                break;
            }
        }
        for (int i = 0; i <= maxMinIndex.length; i++) {
            if (maxMinIndex[i] == min1) {
                index = i;
                System.out.println("Индекс элемента с минимальным значением: " + index);
                break;
            }
        }
    }

    public static void task4() {
        System.out.println(" ");
        System.out.println("Задача 4");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int a = input.nextInt();
        Random r = new Random();
        int[] zeroSum;
        zeroSum = new int[a];
        for (int i = 0; i < zeroSum.length; i++) {
            zeroSum[i] = r.nextInt(20);
        }
        System.out.println("Значение элементов массива: " + Arrays.toString(zeroSum));
        int zero = 0;
        for (int i = 0; i < zeroSum.length - 1; i++) {
            if (zeroSum[i] == 0) {
                zero++;
            }
        }
        if (zero == 0) {
            System.out.println("Нулевых значений нет");
        } else {
            System.out.println("Количество нулевых значений: " + zero);
        }
    }

    public static void task5() {
        System.out.println(" ");
        System.out.println("Задача 5");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int a = input.nextInt();
        Random r = new Random();
        int[] reverseOrder;
        reverseOrder = new int[a];
        for (int i = 0; i < reverseOrder.length; i++) {
            reverseOrder[i] = r.nextInt(20);
        }
        System.out.println("Значение элементов массива: " + Arrays.toString(reverseOrder));

        for (int i = 0; i < reverseOrder.length / 2; i++) {
            int d = reverseOrder[i];
            reverseOrder[i] = reverseOrder[reverseOrder.length - 1 - i];
            reverseOrder[reverseOrder.length - 1 - i] = d;
        }
        System.out.println("Массив в обратном порядке: " + Arrays.toString(reverseOrder));
    }

    public static void task6() {
        System.out.println(" ");
        System.out.println("Задача 6");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int a = input.nextInt();
        Random r = new Random();
        int[] number;
        number = new int[a];
        for (int i = 0; i < number.length; i++) {
            number[i] = r.nextInt(20);
        }
        System.out.println("Значение элементов массива: " + Arrays.toString(number));
        int[] number2 = Arrays.copyOf(number, number.length);
        Arrays.sort(number2);
        if (Arrays.equals(number, number2)) {
            System.out.println("Массив является возрастающей последовательностью");
        } else {
            System.out.println("Массив не является возрастающей последовательностью");
        }
    }

    public static void task7() {
        System.out.println(" ");
        System.out.println("Задача 7");
        int[] number;
        number = new int[]{2, 3, 5, 7, 6};
        int result = 0;
        System.out.println("Значение элементов массива: " + Arrays.toString(number));
        for (int i = number.length - 1, n = 0; i >= 0; --i, n++) {
            int a = (int) Math.pow(10, i);
            result += number[n] * a;
        }
        result = result + 1;
        String resultS = Integer.toString(result);
        char[] charArray = resultS.toCharArray();

        int[] resultArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            resultArray[i] = Character.getNumericValue(charArray[i]);
        }
        System.out.println(Arrays.toString(resultArray));
    }
}