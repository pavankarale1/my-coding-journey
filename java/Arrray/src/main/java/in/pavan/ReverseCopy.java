package in.pavan;

public class ReverseCopy {

    public int[] reverseCopy(int []arr){
        int []resArr = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            resArr[i]=arr[(arr.length-i-1)];

        }
      return resArr;
    }
}
