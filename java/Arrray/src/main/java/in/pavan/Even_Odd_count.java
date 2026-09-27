package in.pavan;

public class Even_Odd_count {
    public int[] odd_even_count(int []arr){
        int odd_count=0, even_count=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]%2==0){
                even_count+=1;
            } else if (arr[i]%2!=0) {
                odd_count+=1;
            }
        }
        int []arr2={odd_count,even_count};

        return arr2;
    }
}
