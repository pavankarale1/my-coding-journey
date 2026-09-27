package in.pavan;

import java.util.Scanner;

public class ArrayPrint {
    static void main(String[] args) {
        ArrUtils a1= new ArrUtils();


        int []arr= a1.inputArray();

        System.out.println("You enterd array is : ");
        a1.printArray(arr);
    }
}
