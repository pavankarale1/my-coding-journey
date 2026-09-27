package in.pavan;

public class ArraySum {
    public int arraySum(int []arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];

        }
        return sum;
    }
    static void main(String[] args) {
        ArrUtils a1=new ArrUtils();
        ArraySum s1= new ArraySum();
        int []arr= a1.inputArray();
        System.out.println("You enterde arry is : ");
        a1.printArray(arr);

        int arrySum= s1.arraySum(arr);
        System.out.println("\nSum of arry is : "+arrySum);

    }
}
