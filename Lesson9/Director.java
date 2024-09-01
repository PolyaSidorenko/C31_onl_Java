package Lesson9;

public class Director implements Staff{
public String nameStaff;
public String typeStaff;

    public Director(String nameStaff, String typeStaff) {
        this.nameStaff = nameStaff;
        this.typeStaff = typeStaff;
    }

    @Override
    public void typeStaff() {
        System.out.println("Должность сотрудника - " + typeStaff);
    }
    @Override
    public void nameStaff(){
        System.out.println("Имя сотрудника " + nameStaff);
    }
}
