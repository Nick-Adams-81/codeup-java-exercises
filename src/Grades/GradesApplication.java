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

        walt.addGrade(85);
        walt.addGrade(76);
        walt.addGrade(100);

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

            if(res.equalsIgnoreCase("JasonVorheesHalloween")) {
                System.out.println();
                System.out.println("This student's name is " + jason.getName() + ", and his grade average is " + jason.getGradeAverage());

            } else if(res.equalsIgnoreCase("dubZ")) {
                System.out.println();
                System.out.println("This student's name is " + walt.getName() + ", his grade average is " + walt.getGradeAverage());
            } else if(res.equalsIgnoreCase("theBigDeal916")) {
                System.out.println();
                System.out.println("This student's name is " + nick.getName() + ", and his grade average is " + nick.getGradeAverage());

            } else if(res.equalsIgnoreCase("JohnnyDoughboy")) {
                System.out.println();
                System.out.println("This is " + johnny.getName() + ", his grade average is " + johnny.getGradeAverage());

            } else {
                System.out.println("No students with that username were found");
            }

            System.out.println("Continue?[y/n]");
            String response = sc.nextLine();
            confirm = response.equalsIgnoreCase("y");

        }while(confirm);


    }

}
