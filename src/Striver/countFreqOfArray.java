package Striver;

public class countFreqOfArray {
    public static void main(String[] args) {
        int arr[]={2,2,34,43,34};
        boolean visited[]=new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            if(visited[i]==true){
                continue;
            }
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println(arr[i]+" ");
        }

    }
}
