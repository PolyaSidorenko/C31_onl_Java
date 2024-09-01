package Lesson8;

public class MyMain {
    public static void main(String[] args) {
        Animals[] zooAnimals = new Animals[]{
                new Dog("Собака", "Никита"),
                new Rabbit("Кролик", "Поля"),
                new Tiger("Тигр", "Катя")
        };

        for(Animals animal : zooAnimals){
            System.out.println(animal);
            animal.eat("Meat");
            animal.voice();
            System.out.println("------------------------------");
        }
    }
}
