package in.pavan.StudentResult;

import java.util.Scanner;

public class Student {

    private int rollNo;
    private String name;
    private int marks;

    public Student(int rollNo,String name,int marks){

        this.rollNo=rollNo;

        this.name=name;

        if(marks>=0 && marks<=100){
            this.marks=marks;
        }

    }

    public void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }
    public int getRollNo(){
        return rollNo;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void updateMarks(int marks){
        if(marks<0 || marks >100){

        }
        else{
            this.marks=marks;
        }
        //this.marks=marks;

    }

    public int getMarks() {
        return marks;
    }

    public void getGrade(){
        if(marks >=90 && marks <=100){
            System.out.println("Your grade is A ");
        }
        else if(marks>=75 && marks<90){
            System.out.println("Your grade is B");
        }
        else if(marks>=60 && marks<75){
            System.out.println("Your grade is C");
        }
        else if(marks>=40 && marks<60){
            System.out.println("Your grade is D");
        }
        else{
            System.out.println("you are fail ");
        }
    }



}
