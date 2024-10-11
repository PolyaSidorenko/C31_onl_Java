package Lesson16;

import java.util.HashMap;
import java.util.Scanner;


public class MyMain {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1(){
        System.out.println("Задача 1");
        System.out.println("Введите слова(буквы) через пробел:");
        Scanner scanner =  new Scanner(System.in);
        String str = scanner.nextLine();
        String[] words = str.split(" ");
        HashMap<String,Boolean> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, true);
            } else {
                map.put(word, false);
            }
        }
        System.out.println(map + "\n");
    }

    public static void task2(){
        System.out.println("Задача 2");
        System.out.println("Введите слова через пробел:");
        Scanner scanner =  new Scanner(System.in);
        String str = scanner.nextLine();
        String[] words = str.split(" ");
        HashMap<String, String> map = new HashMap<>();
        for (String word : words) {
            char[] chars = word.toCharArray();
            String one = String.valueOf(chars[0]);
            String two = String.valueOf(chars[chars.length - 1]);
            map.put(one, two);
        }
        System.out.println(map);
    }
}