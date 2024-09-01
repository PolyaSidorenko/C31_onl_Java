package Lesson8;

public class Rabbit extends Animals {
    public Rabbit(String kind, String name) {
        super(kind, name);
    }
    @Override
    public void voice(){
        System.out.println("Кролит молчит");
    }
    @Override
    public void eat(String food){
        if(food.equals("Grass")){
            System.out.println("Кролик рад травке");
        } else {
            System.out.println("Кролик расстроен");
        }
    }
}