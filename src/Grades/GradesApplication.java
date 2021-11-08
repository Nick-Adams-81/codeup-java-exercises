package Grades;


import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;



public class GradesApplication {

    public static void allGradeAverage(double allGradeAverage) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to see the classes grade average?[y/n]");
        String response1 = sc.nextLine();

        if(response1.equalsIgnoreCase("y")) {
            System.out.println("The overall classes grade average is: " + allGradeAverage);
        }

    }


    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);


        Student nick = new Student("nick");
        Student walt = new Student("Walt");
        Student johnny = new Student("Johnny");
        Student jason = new Student("Jason Voorhees");
        Student karen = new Student("Karen");

        HashMap<String, Student> students = new HashMap<>();
        students.put("theBigDeal916 ", nick);
        students.put("dubZ", walt);
        students.put("JohnnyDoughboy ", johnny);
        students.put("JasonVorhees ", jason);

        nick.addGrade(87);
        nick.addGrade(65);
        nick.addGrade(98);

        walt.addGrade(85);
        walt.addGrade(76);
        walt.addGrade(100);

        johnny.addGrade(45);
        johnny.addGrade(50);
        johnny.addGrade(10);

        jason.addGrade(90);
        jason.addGrade(75);
        jason.addGrade(85);

        karen.addGrade(45);
        karen.addGrade(80);
        karen.addGrade(90);

        nick.recordAttendance("11-08-2021", "P");
        System.out.println(nick.getAttendance());


        double allGradeAverage = ((nick.getGradeAverage() + walt.getGradeAverage() + jason.getGradeAverage() + johnny.getGradeAverage() + karen.getGradeAverage()) / (students.size() + 1));
        System.out.println(allGradeAverage);

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
                System.out.println();
                karen.getGrades(karen.getName());
                System.out.println();

            }

            allGradeAverage(allGradeAverage);
            System.out.println();

            System.out.println("Continue seeing student info?[y/n]");
            String response = sc.nextLine();
            confirm = response.equalsIgnoreCase("y");

        } while (confirm);

        System.out.println("Goodbye, and have a great day!");

    }

}
