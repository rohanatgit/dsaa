package HashMap;

import java.util.HashMap;

public class frequence {
    public static void main(String[] args) {
        HashMap<Integer,Integer>memo=new HashMap<>();
        int nums[]={1,1,1,1,2,2,2};
        for(int currentNum:nums){
            if(memo.containsKey(currentNum)){
                memo.put(currentNum,memo.get(currentNum)+1);
            }
            else{
                memo.put(currentNum,1);
            }
        }
        System.out.print(memo);
    }
}
