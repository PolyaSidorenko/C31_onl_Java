package Lesson18;

import java.util.*;
import java.util.stream.Collectors;

public class MyMain {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
    }

    public static void taskOne(){
        List<Integer> data = new ArrayList<>();
        data.add(5);
        data.add(7);
        data.add(6);
        data.add(4);

        Optional<Integer> result = data.stream()
                .distinct()
                .filter(x -> x % 2 == 0)
                .reduce(Integer::sum);
        System.out.println(result.get());
    }
    public static void taskTwo(){
        Map<Integer, String> idName = new HashMap<>();
        idName.put(6, "Nikita");
        idName.put(5, "Sasha");
        idName.put(1, "Slava");
        idName.put(4, "Nikita");
        idName.put(8, "Katya");
        idName.put(3, "Maksim");
        idName.put(2, "Polya");
        List<StringBuilder> stringList = idName.entrySet().stream()
                .filter(x -> x.getKey().equals(1) || x.getKey().equals(2) || x.getKey().equals(5)
                || x.getKey().equals(8) || x.getKey().equals(9) || x.getKey().equals(13))
                .filter(x -> x.getValue().length() % 2 != 0)
                .map(x -> new StringBuilder(x.getValue()).reverse())
                .collect(Collectors.toList());
        System.out.println(stringList);
    }
}
