package Lessons;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        arrayOutput();
        chessboard();
    }

    public static Scanner getScanner() {
        return new Scanner(System.in);
    }

    public static Random getRandomNumber() {
        return new Random();
    }

    public static void arrayOutput() {
        System.out.println("Введите количество строк и столбцов в массиве: ");
        int n = getScanner().nextInt();
        int m = getScanner().nextInt();
        int[][] randomArray = new int[n][m];
        for (int i = 0; i < randomArray.length; i++) {
            for (int j = 0; j < randomArray[i].length; j++) {
                randomArray[i][j] = getRandomNumber().nextInt(1, 20);
            }
        }
        System.out.println(Arrays.deepToString(randomArray));

        System.out.println("Введите число, которое нужно прибавить к каждому значению: ");
        int newNumber = getScanner().nextInt();
        for (int i = 0; i < randomArray.length; i++) {
            for (int j = 0; j < randomArray[i].length; j++) {
                randomArray[i][j] = randomArray[i][j] + newNumber;
            }
        }
        System.out.println(Arrays.deepToString(randomArray));

        System.out.println("Сумма всех значений: ");
        int sumNumber = 0;
        for (int i = 0; i < randomArray.length; i++) {
            for (int j = 0; j < randomArray[i].length; j++) {
                sumNumber = sumNumber + randomArray[i][j];
            }
        }
        System.out.println(sumNumber);
    }

    public static void chessboard() {
        String[][] blackAndWhite = new String[8][8];
        for (int i = 0; i < blackAndWhite.length; i++) {
            for (int j = 0; j < blackAndWhite[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    blackAndWhite[i][j] = "W";
                } else {
                    blackAndWhite[i][j] = "B";
                }
            }
        }
        System.out.print(Arrays.deepToString(blackAndWhite));
    }
}