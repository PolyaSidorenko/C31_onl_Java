package Lesson9_2;

public abstract class Shapes {
    public String shapesType;

    public Shapes(String shapesType) {
        this.shapesType = shapesType;
    }

    public abstract int perimeter();
    public abstract void square();
}
