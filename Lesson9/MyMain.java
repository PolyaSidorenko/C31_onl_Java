package Lesson9;
/*
Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
который печатает название должности и имплементировать этот метод в созданные
классы.
 */
public class MyMain {
    public static void main(String[] args) {
        Director d = new Director("Никита", "директор");
        Accountant a = new Accountant("Полина", "бухгалтер");
        Worker w = new Worker("Саша", "рабочий");
        d.typeStaff();
        d.nameStaff();
        System.out.println("-----------------");
        a.typeStaff();
        a.nameStaff();
        System.out.println("-----------------");
        w.typeStaff();
        w.nameStaff();
    }
}
