package Lesson9;

public class Accountant implements Staff{
    public String nameStaff;
    public String typeStaff;

    public Accountant(String nameStaff, String typeStaff) {
        this.nameStaff = nameStaff;
        this.typeStaff = typeStaff;
    }

    @Override
    public void nameStaff(){
        System.out.println("Имя сотрудника " + this.nameStaff);
    }

    @Override
    public void typeStaff() {
        System.out.println("Должность сотрудника - " + this.typeStaff);
    }
}
