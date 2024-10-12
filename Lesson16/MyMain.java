package Lesson16;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class MyMain {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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

    public static void task3(){
        String str = "(({[])))";
        String[] strings = str.split("");
        List<String> arrays = Arrays.asList(strings);
        if (arrays.size() % 2 != 0){
            System.out.println("Строка не сбалансирована");
        } else {
            for (int i = arrays.size()/2; i < arrays.size(); i++){
                switch (arrays.get(i)) {
                    case "}" :
                        arrays.set(i, "{");
                        break;
                    case "]":
                        arrays.set(i, "[");
                        break;
                    case ")":
                        arrays.set(i, "(");
                        break;
                }
            }
            boolean one = true;
            for (int i = 0; i < arrays.size()/2; i++){
                if (!arrays.get(i).equals(arrays.get(arrays.size() - i - 1))){
                    one = false;
                }
            }
            if (one == true){
                System.out.println("Строка сбалансирована");
            } else {
                System.out.println("Строка не сбалансирована");
            }
        }
    }
}