package Lesson9_2;

public class Triangle extends Shapes{
    public int firstSide;
    public int secondSide;
    public int thirdSide;

    public Triangle(String shapesType, int firstSide, int secondSide, int thirdSide) {
        super(shapesType);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }
    @Override
    public int perimeter(){
        int trianglePerimeter = firstSide + secondSide + thirdSide;
        System.out.println("Периметр треугольника равен " + trianglePerimeter);
        return trianglePerimeter;
    }
    @Override
    public void square(){
        int triangleSquare = firstSide*secondSide/2;
        System.out.println("Площадь треугольника равна " + triangleSquare);
    }
}
