package in.pavan;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        ArrUtils a1= new ArrUtils();


        // INPUT OF ARRAY
        int []arr= a1.inputArray();

        //PRINT A ARRAY
        System.out.println("You enterd array is : ");
        a1.printArray(arr);

        //SUM OF ARRAY
        ArraySum s1= new ArraySum();
        int arrySum= s1.arraySum(arr);
        System.out.println("\nSum of arry is : "+arrySum);

        // FIND LARGER NUMBER OF ARRAY
        LargeOfArry l1=new LargeOfArry();
        System.out.println("Larger number from array is : "+l1.arryLargerNumber(arr));

        // FIND SMALLEST NUMBER FROM ARRAY
        SmallestElement smallestElement= new SmallestElement();
        int small=smallestElement.smallestElement(arr);
        System.out.println("Smallest number of array is : "+small);


        // ODD AND EVENT COUNT IN ARRY METHORD RETURN A ARRY THAT CONTAIN 2 VALUES 1ST IS ODD COUNT AND 2ND IS EVEN COUNT
        Even_Odd_count evenOddCount= new Even_Odd_count();
        int []oddEven = evenOddCount.odd_even_count(arr);
        System.out.println("Odd number cont in a array is : "+oddEven[0]);
        System.out.println("Even number cont in a array is : "+oddEven[1]);

        // COUNT POSITIVE NEGETIVE AND ZERO
        PositiveNegativeZeroCount positiveNegativeZeroCount = new PositiveNegativeZeroCount();
        // IT RETURN ARRY THAT CONTAIN POSTIVE COUNT, NEGATIVE COUNT, ZERO COUNT RESPECTIVLY IN ARRAY
        int []PNZcount=positiveNegativeZeroCount.positiveNegativeZeroCount(arr);
        System.out.println("Postive Cont : "+PNZcount[0]);
        System.out.println("Negative Cont : "+PNZcount[1]);
        System.out.println("Zero Cont : "+PNZcount[2]);

        // REVERS AN ARRY
        ReverseCopy reverseCopy= new ReverseCopy();
        int []resArr=reverseCopy.reverseCopy(arr);
        System.out.println("Reverse array is : ");
        a1.printArray(resArr);


        // FIND AVRAGE OF AN A ARRY
        Avrage avrage = new Avrage();
        float avg=avrage.arrayAvrage(arr);
        System.out.println("Avrage of an arry is : "+avg);

        // SERCH AN ELEMENT
        Serch serch=new Serch();
        System.out.print("Enter number to serch in array : ");
        int n= input.nextInt();
        boolean ans=serch.serchElement(arr,n);
        if(ans){
            System.out.println(" "+n+" is found in this array ");
        }else{
            System.out.println(" "+n+" is not found in this array ");
        }

        // FIND FREQUENCY OF AN ELEMENT
        FrequenceOfElement frequenceOfElement = new FrequenceOfElement();
        System.out.print("Enter number to find frequency : ");
        n= input.nextInt();
        int frequency=frequenceOfElement.findFrequncy(arr,n);
        System.out.println("Frequncy of "+n+" is : "+frequency);



    }
}