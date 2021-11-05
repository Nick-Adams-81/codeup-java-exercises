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

        double calculate = -1;
        for (int i = 0; i < grades.size(); i++) {
            //System.out.println(grades.get(i));
            calculate = grades.get(i) + grades.get(i);
            System.out.println(calculate);
        }
        //System.out.println(grades.size());
        return calculate;
    }


    public static void main(String[] args) {
        Student nick = new Student("Nick");
        nick.addGrade(86);
        nick.addGrade(50);
        nick.addGrade(100);


        //System.out.println(nick.grades);
        nick.getGradeAverage();

    }


}
