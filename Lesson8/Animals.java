package Lesson8;

public class Animals {
    private String kind;
    private String name;

    public String getKind() {
        return kind;
    }

    public String getName() {
        return name;
    }

    public Animals(String kind, String name) {
        this.kind = kind;
        this.name = name;
    }
   public void voice(){};
   public void eat(String food){};

    public String toString() {
        return "Животное " + this.kind + "\n" +
                "Имя животного " + this.name;
    }
}
