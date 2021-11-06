package Grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;


    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }


    public double getGradeAverage() {
        double calculateSum = 0;
        double sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            calculateSum += grades.get(i);
            sum = calculateSum / grades.size();
        }
        return sum;
    }

    public double getGrades(String name) {
        double grade = 0;
        for (int i = 0; i < grades.size(); i++) {
            grade = grades.get(i);
            System.out.println(name +  "'s grades are Grade " + (i + 1) + ": " + grade);
        }
        return grade;
    }

    public static void main(String[] args) {
        Student nick = new Student("Nick");
        nick.addGrade(86);
        nick.addGrade(50);
        nick.addGrade(100);
        nick.addGrade(24);

        nick.getGrades(nick.getName());
        System.out.println(nick.getGradeAverage());
        System.out.println("nick.getName() = " + nick.getName());

    }

}
