package Striver;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={3,4,5,7,8,9};
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int p=0;p<arr.length;p++){
            System.out.print(arr[p]+" ");
        }
    }
}
