package Striver;

import java.util.HashMap;
import java.util.Map;

public class RepeatedElement {
    public static void main(String[] args) {
        int arr[]={2,3,2,2,2,2,2,2,23,3,4,5,5,6};
        Map<Integer,Integer> fmap=new HashMap<>();
        for(int num:arr){
            fmap.put(num,fmap.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:fmap.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }
}
