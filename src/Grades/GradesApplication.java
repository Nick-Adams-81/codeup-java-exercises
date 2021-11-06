package Grades;

import java.util.HashMap;

import java.util.Scanner;


public class GradesApplication {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student nick = new Student("nick");
        Student walt = new Student("Walt");
        Student johnny = new Student("Johnny");
        Student jason = new Student("Jason Voorhees");

        HashMap<String, Student> students = new HashMap<>();
        students.put("theBigDeal916 ", nick);
        students.put("dubZ", walt);
        students.put("JohnnyDoughboy ", johnny);
        students.put("JasonVorhees ", jason);

        nick.addGrade(87);
        nick.addGrade(65);
        nick.addGrade(98);

        //nick.getGrades();

        walt.addGrade(85);
        walt.addGrade(76);
        walt.addGrade(100);

        // walt.getGrades();

        johnny.addGrade(45);
        johnny.addGrade(50);
        johnny.addGrade(10);

        jason.addGrade(90);
        jason.addGrade(75);
        jason.addGrade(85);


        boolean confirm;

        do {

            System.out.println("Welcome! here is a list of students you can see more about, who would you like to see?");
            System.out.println(students.keySet());
            String res = sc.nextLine();

            if (res.equalsIgnoreCase("JasonVorhees")) {
                System.out.println();
                System.out.println("This student's name is " + jason.getName() + ", and his grade average is " + jason.getGradeAverage() + ", His individual grades are:");
                jason.getGrades(jason.getName());
            } else if (res.equalsIgnoreCase("dubZ")) {
                System.out.println();
                System.out.println("This student's name is " + walt.getName() + ", his grade average is " + walt.getGradeAverage() + ", his grades are:");
                walt.getGrades(walt.getName());
            } else if (res.equalsIgnoreCase("theBigDeal916")) {
                System.out.println();
                System.out.println("This student's name is " + nick.getName() + ", and his grade average is " + nick.getGradeAverage() + ", his individual grades are:");
                nick.getGrades(nick.getName());
            } else if (res.equalsIgnoreCase("JohnnyDoughboy")) {
                System.out.println();
                System.out.println("This is " + johnny.getName() + ", his grade average is " + johnny.getGradeAverage() + ", his individual grades are:");
                johnny.getGrades(johnny.getName());

            } else {
                System.out.println("No students with that username were found");
            }

            System.out.println("would you like to see all the students grades?[y/n]");
            String seeAllGrades = sc.nextLine();

            if (seeAllGrades.equalsIgnoreCase("y")) {
                jason.getGrades(jason.getName());
                System.out.println();
                walt.getGrades(walt.getName());
                System.out.println();
                nick.getGrades(nick.getName());
                System.out.println();
                johnny.getGrades(johnny.getName());
            }

            System.out.println("Continue seeing student info?[y/n]");
            String response = sc.nextLine();
            confirm = response.equalsIgnoreCase("y");

        } while (confirm);

        System.out.println("Goodbye, and have a great day!");

    }

}
