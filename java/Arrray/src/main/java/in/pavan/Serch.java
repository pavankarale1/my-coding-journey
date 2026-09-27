package in.pavan;

public class Serch {
    public boolean serchElement(int []arr,int n) {
        for(int i=0;i< arr.length;i++){
            if(arr[i]==n){
                return true;
            }
        }
        return false;
    }
}
