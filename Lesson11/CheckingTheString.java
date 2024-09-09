package Lesson11;

import java.util.Arrays;
import java.util.Scanner;

public class CheckingTheString {
    public static void main(String[] args) {
        checkStringOne();
        checkStringTwo();
        checkStringThree();
        checkStringFor();
        checkStringFive();
    }

    public static Scanner getScanner() {
        return new Scanner(System.in);
    }

    public static void checkStringOne() {
        System.out.println("Задача 1");
        System.out.println("Введите три строки:");
        String[] str = {getScanner().nextLine(), getScanner().nextLine(), getScanner().nextLine()};
        for (String s : str) {
            int max = str[0].length();
            String p = null;
            for (int i = 1; i < str.length; i++) {
                if (str[i].length() > max) {
                    max = str[i].length();
                    p = str[i];
                }
            }
            System.out.println("Самая длинная строка: " + p);
            System.out.println("Максимальное число элементов в строке: " + max);
            break;
        }
        int min = str[0].length();
        String p = str[0];
        for (int i = 1; i < str.length; i++) {
            if (str[i].length() < min) {
                min = str[i].length();
                p = str[i];
            }
        }
        System.out.println("Самая короткая строка: " + p);
        System.out.println("Минимальное число элементов в строке: " + min);
    }

    public static void checkStringTwo() {
        System.out.println("Задача 2");
        System.out.println("Введите три строки:");
        String[] str = {getScanner().nextLine(), getScanner().nextLine(), getScanner().nextLine()};
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = 0; j < str.length - i - 1; j++) {
                if (str[j + 1].length() < str[j].length()) {
                    String test = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = test;
                }
            }
        }
        System.out.println("Строки по возрастанию");
        for (String s : str) {
            System.out.print(s + " ");
        }
        System.out.println("");
    }

    public static void checkStringThree() {
        System.out.println("Задача 3");
        System.out.println("Введите три строки:");
        String[] str = {getScanner().nextLine(), getScanner().nextLine(), getScanner().nextLine()};
        for (String s : str) {
            if (s.length() < str[1].length()) {
                System.out.println("Строка, короче чем средняя: " + s);
                System.out.println("Количество элементов строки: " + s.length());
            }
        }
    }

    public static void checkStringFor() {
        System.out.println("Задача 4");
        System.out.println("Введите три строки:");
        String[] str = {getScanner().nextLine(), getScanner().nextLine(), getScanner().nextLine()};
        for (String s : str) {
            if (check(s)) {
                System.out.println("Строка с неповторяющимися символами: " + s);
                break;
            }
        }
    }

    public static boolean check(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void checkStringFive(){
        System.out.println("Задача 5");
        System.out.println("Введите одну строку:");
        String str = getScanner().nextLine();
        char[] chars = str.toCharArray();
        StringBuilder finalString = new StringBuilder();
        for (char aChar : chars) {
            String testString = String.valueOf(aChar);
            testString += testString;
            finalString.append(testString);
        }
        System.out.println("Строка с удвоенными символами: " + finalString);
    }
}
