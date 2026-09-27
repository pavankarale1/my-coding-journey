package in.pavan;

import java.util.Scanner;

public class ArrUtils {
    Scanner input = new Scanner(System.in);

    public int[] inputArray(){

        System.out.println("Enter a size of array");
        int n = input.nextInt();
        int []arr = new int[n];

        for (int i=0;i<n;i++){
            System.out.print("Enter the "+(i+1)+"th element of array : ");
            arr[i]= input.nextInt();
        }
        return arr;
    }
    public void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){

            System.out.print(" "+arr[i]);
        }
    }

}