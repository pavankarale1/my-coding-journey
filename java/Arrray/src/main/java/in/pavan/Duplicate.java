package in.pavan;

import java.util.Scanner;

public class Duplicate {
    void duplicate(int []arr){
        for (int i=0;i< arr.length;i++){
            for(int j=(i+1);j< arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println("\n found duplicate : "+arr[i]);
                }
            }
        }

    }


    static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        ArrUtils a1= new ArrUtils();


        // INPUT OF ARRAY
        int []arr= a1.inputArray();

        //PRINT A ARRAY 
        System.out.println("You enterd array is : ");
        a1.printArray(arr);

        Duplicate duplicate =new Duplicate();
        duplicate.duplicate(arr);
    }
}
