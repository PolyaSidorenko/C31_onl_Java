package Lesson13;

import java.util.Scanner;

public class ExceptionAndErrors {
    public static void main(String[] args) {
        person();
    }
    public static String getScanner(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    static void person() {
        System.out.print("Введите Ваш логин (не более 20 симоволов и без пробела): ");
        String login = getScanner();
        System.out.print("Введите Ваш пароль (не более 20 символов, без пробела и хотя бы с одной цифрой: ");
        String password = getScanner();
        System.out.print("Повторите Ваш пароль: ");
        String confirmPassword = getScanner();

        try {
            boolean check = checkingTheEnteredData(login, password, confirmPassword);
            System.out.println("Вы успешно зарегистрировались!");
        } catch (WrongLoginException e) {
            System.out.println("Ошибка логина: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Ошибка пароля: " + e.getMessage());
        }
    }

    public static boolean checkingTheEnteredData(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        String whitespace = " ";
        if (login.length() >= 20 || login.contains(whitespace)) {
            throw new WrongLoginException("Логин содержит более 20 симоволов или содержит пробел");
        }
        if (password.length() >= 20 || password.contains(whitespace) || !password.matches(".*\\d.*")) {
            throw new WrongPasswordException
                    ("Пароль содержит более 20 символов, содержит пробел или не содержит хотя бы одну цифру");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
        return true;
    }
}
