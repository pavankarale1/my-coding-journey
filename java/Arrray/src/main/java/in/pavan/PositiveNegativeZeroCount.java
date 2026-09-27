package in.pavan;

public class PositiveNegativeZeroCount {
    public int[] positiveNegativeZeroCount(int []arr){

        int positiveCount=0, negativeCount=0, zeroCount=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>0){
                positiveCount++;
            } else if (arr[i]<0) {
                negativeCount++;
            }else {
                zeroCount++;
            }
        }
        int []arr2={positiveCount,negativeCount,zeroCount};
        return arr2;
    }
}
