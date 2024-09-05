package Lesson10;

import java.util.Objects;

public class Person implements Cloneable {
    private String name;
    private String specialization;
    private int age;

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, String specialization, int age) {
        this.name = name;
        this.specialization = specialization;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(specialization, person.specialization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, specialization, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public Person clone() {
        try {
            Person clone = (Person) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
