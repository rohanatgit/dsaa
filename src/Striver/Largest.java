package Striver;

public class Largest {
    public static void main(String[] args) {
        int arr[]={2,3,90,5};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
