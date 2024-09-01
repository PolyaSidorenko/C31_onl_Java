package Lesson8;

public class Tiger extends Animals{
    public Tiger(String kind, String name){
        super(kind, name);
    }
    public void voice(){
        System.out.println("Тигр говорит ррр!");
    }
    @Override
    public void eat(String food){
        if(food.equals("Meat")){
            System.out.println("Тигр рад мясу");
        } else {
            System.out.println("Тигр расстроен");
        }
    }
}
