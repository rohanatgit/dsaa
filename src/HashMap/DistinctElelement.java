package HashMap;

import java.util.HashMap;

public class DistinctElelement {
    public static void main(String[] args) {
        HashMap<Integer,Integer>memo=new HashMap<>();
        int nums[]={1,2,1,4};

        for(int currentNum:nums){
            if(memo.containsKey(currentNum)){
                memo.put(currentNum,memo.get(currentNum)+1);
            }
            else{
                memo.put(currentNum,1);
            }
        }
        int count=0;
        for(int key:memo.keySet()){
            if(memo.get(key)==1){
                count++;
            }
        }
        System.out.println(count);
    }
}
