package Lesson9_2;

public class Rectangle extends Shapes {
    public int firstSide;
    public int secondSide;

    public Rectangle(String shapesType, int firstSide, int secondSide) {
        super(shapesType);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }
    @Override
    public int perimeter(){
        int rectanglePerimeter = 2*(firstSide + secondSide);
        System.out.println("Периметр прямоугольника равен " + rectanglePerimeter);
        return rectanglePerimeter;
    }
    @Override
    public void square(){
        int rectangleSquare = firstSide*secondSide;
        System.out.println("Площадь прямоугольника равна " + rectangleSquare);
    }
}
