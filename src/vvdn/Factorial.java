package vvdn;

import java.util.Scanner;

public class Factorial {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        System.out.println(fact(n));
//    }
//    public static int fact(int n){
//        if(n==0){
//            return 1;
//        }
//
//        return n*fact(n-1);
//    }
public static void main(String[] args) {
    int res=1;
    int i;
    for(i=2;i<=res;i++){
        res*=i;
    }
    System.out.println(res);
}
}
