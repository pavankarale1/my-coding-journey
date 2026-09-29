package in.pavan.Overridding.Shape;

import java.util.Scanner;

public class Circle extends Shape{
    Scanner input = new Scanner(System.in);
    @Override
    public double calculateArea(){
        System.out.print("Enter a radius : ");
        float r=input.nextFloat();
        double pi=3.14;


        return pi*r*r;
    }

}
