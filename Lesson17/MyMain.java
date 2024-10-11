package Lesson17;

import java.time.LocalDate;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        countingBirthday();
        outputPositiveNumbers();
        currencyExchange();
        currencyExchangeTwo();
        stringConversion();
    }
    public static void countingBirthday(){
        System.out.println("Задача 1");
        System.out.println("Введите дату рождения в формате год, месяц, день через enter: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        LocalDate localDate = LocalDate.of(year, month,day);
        System.out.println(localDate.plusYears(100) + "\n");
    }

    public static void outputPositiveNumbers(){
        System.out.println("Задача 2");
        int[] array = {-5,6,-4,7,8};
        Predicate<Integer> isEvenNumber = x -> x >= 0;
        for (int a : array){
            if(isEvenNumber.test(a)){
                System.out.println(a + " ");
            }
        }
    }

    public static void currencyExchange(){
        System.out.println("Задача 3");
        System.out.println("Введите сумму ");
        Scanner scanner = new Scanner(System.in);
        String credit = scanner.nextLine();
        String[] str = credit.split(" ");
        Function<String, Double> creditConverter = x -> Integer.valueOf(x) / 3.3;
        System.out.println(creditConverter.apply(str[0]) + "\n");
    }

    public static void currencyExchangeTwo(){
        System.out.println("Задача 4");
        System.out.println("Введите сумму ");
        Scanner scanner = new Scanner(System.in);
        String credit = scanner.nextLine();
        String[] str = credit.split(" ");
        Consumer<String> creditConverter = x -> System.out.println(Integer.valueOf(x)/3.3);
        creditConverter.accept(str[0]);
    }

    public static void stringConversion(){
        System.out.println("Задача 5");
        System.out.println("Введите строку");
        Scanner scanner = new Scanner(System.in);
        String credit = scanner.nextLine();
        char[] chars = credit.toCharArray();
        Supplier<String> supplier = () -> {
            for(int i = 0; i < chars.length / 2; i++)
            {
                char temp = chars[i];
                chars[i] = chars[chars.length - i - 1];
                chars[chars.length - i - 1] = temp;
            }
            return String.valueOf(chars);
        };
        System.out.println(supplier.get());
    }
}
