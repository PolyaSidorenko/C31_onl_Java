package Lesson15;


import java.util.*;

public class JavaCollection {
    public static void main(String[] args) {
        arraySet();
        animalNames();

    }

    public static void arraySet() {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        Set<String> hashSet = new HashSet<>(Arrays.asList(str));
        System.out.println(hashSet);
    }

    public static void animalNames() {
        AnimalNames animalNames1 = new AnimalNames(new LinkedList<>());
        animalNames1.addName();
        animalNames1.addName();
        animalNames1.addName();
        animalNames1.addName();
        animalNames1.output();
        animalNames1.removeName();
        animalNames1.removeName();
        animalNames1.output();
    }
}
