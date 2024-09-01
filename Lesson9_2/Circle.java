package Lesson9_2;

public class Circle extends Shapes{
public int rad;

    public Circle(String shapesType, int rad) {
        super(shapesType);
        this.rad = rad;
    }
    @Override
    public int perimeter(){
        double circlePerimeter = 2*3.14*rad;
int result = (int)circlePerimeter;
        System.out.println("Периметр круга равен " + result);
        return result;
    }

    @Override
    public void square() {
        double circleSquare = 3.14*rad*rad/2;
        int result = (int)circleSquare;
        System.out.println("Площадь круга равна " + result);
    }
}