package Lesson9_2;

public class MyMain {
    public static void main(String[] args) {
       Shapes[] shapes = new Shapes[]{
               new Circle("Круг", 4),
               new Rectangle("Прямоугльник", 5,10),
               new Triangle("Треугольник", 7,8,4),
               new Rectangle("Прямоугльник",7,8),
               new Triangle("Треугольник",14,7,9)
       };
       int sumPerimeter = 0;
            for(Shapes shapes1 : shapes) {
                System.out.println(shapes1.shapesType);
                int i = shapes1.perimeter();
                sumPerimeter = sumPerimeter + i;
                shapes1.square();
                System.out.println("-------------------");
            }
        System.out.println("Сумма периметров всех фигур равна " + sumPerimeter);
        }
    }
