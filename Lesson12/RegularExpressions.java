package Lesson12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {
        abbreviation();
        informationOutput();
    }

    public static void abbreviation(){
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\p{Lu}{2,6}");
        Matcher matcher = pattern.matcher(input);
        while(matcher.find())
            System.out.println(matcher.group());
    }

    public static void informationOutput(){
        System.out.println("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern document = Pattern.compile("[0-9]{4}-[0-9]{3}-[0-9]{3}");
        Matcher matcher = document.matcher(input);
        Pattern number = Pattern.compile("\\+\\([0-9]{2}\\)[0-9]{7}");
        Matcher matcher1 = number.matcher(input);
        Pattern email = Pattern.compile("[a-z0-9]{2,15}@[a-z]{4,5}\\.[a-z]{2,6}", Pattern.CASE_INSENSITIVE);
        Matcher matcher2 = email.matcher(input);
        while (matcher.find())
            System.out.println("Номер документа: " + matcher.group());
        while (matcher1.find())
            System.out.println("Номер телефона: " + matcher1.group());
        while (matcher2.find())
            System.out.println("Email: " + matcher2.group());
    }
}

