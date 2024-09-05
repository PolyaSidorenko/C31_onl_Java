package Lesson10;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Polya","Engineer",22);
        Person person1 = new Person("Nikita","Programmer",26);
        Person person2 = new Person("Katya","Business analyst",26);
        Person person3 = person.clone();

        System.out.println(person3.equals(person));
        person3.setName("Sasha");
        System.out.println(person3.equals(person));

        System.out.println(person);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
