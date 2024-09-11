package Lesson11;

import java.util.Scanner;

public class stringPalindrome {
    public static void main(String[] args) {
        checkString();
    }

    public static void checkString() {
        System.out.println("Введите строку, состояющую из нескольких слов: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] arrayString = string.split(" ");
        System.out.println("Введите номер слова, которое хотите проверить: ");
        int test = scanner.nextInt();
        if (test < arrayString.length) {
            char[] chars = arrayString[test - 1].toCharArray();
            if (palindrome(chars)) {
                System.out.println("Слово является палиндромом!");
            } else {
                System.out.println("Слово не является палиндромом :(");
            }
        } else {
            System.out.println("В строке нет столько слов. Введите значение меньше " + (arrayString.length + 1));
        }
    }

    public static boolean palindrome(char[] chars) {
        int intOne = 0;
        int intTwo = chars.length - 1;
        while (intTwo > intOne) {
            if (chars[intOne] != chars[intTwo]) {
                return false;
            }
            ++intOne;
            --intTwo;
        }
        return true;
    }
}
