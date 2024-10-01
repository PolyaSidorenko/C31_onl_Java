package Lesson15;

import java.util.Arrays;
import java.util.HashMap;

public class Student {
    private String name;
    private String groupNumber;
    private int yearNumber;
    private int[] points;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGroupNumber() {
        return groupNumber;
    }
    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }
    public int getYearNumber() {
        return yearNumber;
    }
    public void setYearNumber(int yearNumber) {
        this.yearNumber = yearNumber;
    }

    public int[] getPoints() {
        return points;
    }

    public void setPoints(int[] points) {
        this.points = points;
    }

    public Student(String name, String groupNumber, int yearNumber, int[] points) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.yearNumber = yearNumber;
        this.points = points;
    }
    @Override
    public String toString() {
    return "Students {" + "name: " + name + ", group number: "
            + groupNumber + ", year: " + yearNumber + ", points:" + Arrays.toString(points) + "}";
    }

}
