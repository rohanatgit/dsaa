package Striver;

import java.util.Map;
import java.util.*;

public class countfreq2 {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,5,3,2};
        Map<Integer,Integer>fre=new HashMap<>();
        for(int num:arr){
            fre.put(num, fre.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer,Integer>entry:fre.entrySet()){
            System.out.println(entry.getKey());
        }
    }
}
