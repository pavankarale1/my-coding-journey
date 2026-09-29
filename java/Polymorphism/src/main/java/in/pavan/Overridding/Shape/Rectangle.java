package in.pavan.Overridding.Shape;

import java.util.Scanner;

public class Rectangle extends Shape {
    Scanner input= new Scanner(System.in);
    @Override
    public double calculateArea(){
        System.out.print("Enter a height of rectangle : ");
        float h= input.nextFloat();
        System.out.print("Enter a weidth of rectangle : ");
        float w = input.nextFloat();



        return h*w;
    }
}
