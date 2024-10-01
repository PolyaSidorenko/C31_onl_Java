package Lesson15;

import java.util.*;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Polina", "115A", 2, new int[]{5, 5, 4, 5, 5, 5}));
        students.add(new Student("Vasiliy", "115A", 2, new int[]{3, 3, 4, 2, 2, 3}));
        students.add(new Student("Nikita", "113A", 4, new int[]{2, 3, 5, 2, 5, 4}));
        students.add(new Student("Pavel", "113A", 4, new int[]{4, 2, 5, 3, 5, 5}));
        students.add(new Student("Katya", "112A", 4, new int[]{3, 3, 3, 3, 3, 3}));
        for (Student student : students) {
            System.out.println(student);
            double avg = avg(student.getPoints());
            System.out.println("Средний балл студента: " + String.format("%.1f", avg));
        }
        System.out.println("-------------------------------------------------------------");

        for (int i = students.size() - 1; i >= 0; --i) {
            double avg = avg(students.get(i).getPoints());
            if (avg < 3) {
                students.remove(i);
            } else {
                students.get(i).setYearNumber(students.get(i).getYearNumber() + 1);
            }
        }
        for (Student student : students){
            System.out.println(student);
            double avg = avg(student.getPoints());
            System.out.println("Средний балл студента: " + String.format("%.1f", avg));
        }
        System.out.println("--------------------------------------------------------");
        int yearNumber = 3;
        printStudents(students, yearNumber);
        yearNumber = 5;
        printStudents(students, yearNumber);
    }

    public static double avg(int[] points) {
        int summ = 0;
        double avg = 0;
        for (int p : points) {
            summ = summ + p;
        }
        avg = (double) summ / points.length;
        return avg;
    }

    public static void printStudents(List<Student> students, int yearNumber) {
        System.out.println("Студенты " + yearNumber + " курса:");
        for (Student student : students) {
            if (student.getYearNumber() == yearNumber) {
                System.out.println(student.getName());
            }
        }
    }
}
