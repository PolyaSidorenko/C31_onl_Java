package Lesson18;

import java.util.Optional;
import java.util.*;
/*
Задача 1:
Создать класс User с полем name. В Main создать поле user типа User. Заранее мы не
знаем лежит там объект или отсутствует. Написать логику, которая будет выводить имя
пользователя если объект присутствует в user, либо ‘DEFAULT’ в противном случае.
Использовать класс Optional.
Задача 2:
При помощи стримов из списка строк вывести только те, которые начинаются с буквы ‘A’.
Задача 3:
При помощи стримов из списка, содержащего объекты Developer, вывести только те, id >
10 и name начинается с ‘An’.
 */
public class ClassWork {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
    }

    public static void taskOne(){
        User user = new User(null);
        Optional<String> optionalS = Optional.ofNullable(user.getName()).orElse("DEFAULT").describeConstable();
        optionalS.ifPresent(System.out::println);
    }

    public static void taskTwo(){
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Polya");
        arrayList.add("Alisa");
        arrayList.add("Anna");
        arrayList.add("Nikolay");
        arrayList.add("Katya");

        List<String> stringList = arrayList.stream()
                .filter(x -> x.substring(0, 1).matches("[Aa]"))
                .toList();
        System.out.println(stringList);
    }
    public static void taskThree(){
        Developer developer = new Developer(12, "Polya");
        Developer developerOne = new Developer(9, "Nikita");
        Developer developerTwo = new Developer(11, "Anna");
        Developer developerFive = new Developer(18, "Alisa");
        Developer developerThree = new Developer(8, "Katya");
        Developer developerFour = new Developer(15, "Anatoliy");
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(developer.getId(), developer.getName());
        hashMap.put(developerOne.getId(), developerOne.getName());
        hashMap.put(developerTwo.getId(), developerTwo.getName());
        hashMap.put(developerThree.getId(), developerThree.getName());
        hashMap.put(developerFour.getId(), developerFour.getName());
        hashMap.put(developerFive.getId(), developerFive.getName());
        List<String> listName = hashMap.entrySet().stream()
                .filter(x -> x.getKey() > 10)
                .filter(x -> x.getValue().startsWith("An"))
                .map(Map.Entry::getValue)
                .toList();
        System.out.println(listName);
    }
}
