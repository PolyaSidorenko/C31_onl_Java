package Lesson7;

public class Surgeon extends Doctors{
    Surgeon(String name, String specialization) {
        super(name, specialization);
    }

    @Override
    void treat() {
        System.out.println("Врач " + this.getName() + " со специализацией " + this.getSpecialization() + " начинает лечение");
    }
}
