package in.pavan;

public class LargeOfArry {
    public int arryLargerNumber(int []arr){
        int larger = arr[0];
        for(int i=0;i<arr.length;i++){
            if(larger<arr[i]){
                larger=arr[i];
            }
        }
        return larger;
    }
}
