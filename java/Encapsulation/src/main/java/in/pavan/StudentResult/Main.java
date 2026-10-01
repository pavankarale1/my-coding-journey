package in.pavan.StudentResult;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int rollNo = input.nextInt();

        input.nextLine(); // consume newline

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Marks: ");
        int marks = input.nextInt();

        Student student = new Student(rollNo, name, marks);

        System.out.println("\n----- Student Result -----");
        System.out.println("Roll No: " + student.getRollNo());
        System.out.println("Name: " + student.getName());
        System.out.println("Marks: " + student.getMarks());

        student.getGrade();

        input.close();
    }
}


//package in.pavan.StudentResult;
//
//public class Main {
//    static void main(String[] args) {
//        Student s1= new Student(111,"AAA",92);
//
//        s1.getGrade();
//
//    }
//}
