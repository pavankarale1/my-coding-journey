package in.pavan;

public class FrequenceOfElement {
    public int findFrequncy(int[]arr,int n){
        int count =0;
        for(int i=0;i< arr.length;i++){
            if (arr[i]==n){
                count++;
            }
        }
        return count;
    }
}
