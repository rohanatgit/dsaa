package Striver;

public class secoundsmallestAndLargest {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,7};
        int smallest=Integer.MAX_VALUE;
        int secsmallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        int secLargest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                secsmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<secsmallest && arr[i]!=smallest){
                secsmallest=arr[i];
            }
            if(arr[i]>largest){
                secLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secLargest && arr[i]!=largest){
                secLargest=arr[i];
            }
        }
        System.out.println(secLargest);
        System.out.println(secsmallest);
    }
}
