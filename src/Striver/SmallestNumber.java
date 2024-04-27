package Striver;

public class SmallestNumber {
    public static void main(String[] args) {
        int arr[]={2,1,4,3};
        int min=Integer.MAX_VALUE;
        //int min=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }

}
