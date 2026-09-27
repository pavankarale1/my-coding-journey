package in.pavan;

public class SmallestElement {
    public int smallestElement(int []arr){
        int small=arr[0];
        for(int i=0;i<arr.length;i++){
            if(small>arr[i]){
                small=arr[i];
            }
        }
        return small;
    }
}
