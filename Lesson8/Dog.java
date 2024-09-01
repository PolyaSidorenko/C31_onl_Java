package Lesson8;

public class Dog extends Animals{
    public Dog(String kind, String name){
        super(kind, name);
    }
    public void voice(){
        System.out.println("Собака говорит гав-гав!");
    }
    @Override
    public void eat(String food){
        if(food.equals("Meat")){
            System.out.println("Собака рада мясу");
        } else {
            System.out.println("Собака расстроена");
        }
    }
}
