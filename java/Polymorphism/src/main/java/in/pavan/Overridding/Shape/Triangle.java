package in.pavan.Overridding.Shape;

import java.util.Scanner;

public class Triangle extends Shape{
    Scanner input = new Scanner(System.in);
    @Override
    public double calculateArea(){

        System.out.print("Enter the height of triangle : ");
        double h=input.nextDouble();
        System.out.print("Enter the base of triangle : ");
        double b= input.nextDouble();

        return (0.5*(b*h));
    }

}
