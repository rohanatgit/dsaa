package Striver;

import java.util.HashSet;

public class duplicateNumber {
    public static void main(String[] args) {
        HashSet<Integer>hs=new HashSet<>();
        int arr[]={2,3,2,2,2,2,2,3,4,4,5};
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        for(int num:hs){
            System.out.println(num);
        }
    }
}
