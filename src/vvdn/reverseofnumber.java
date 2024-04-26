package vvdn;

import java.util.Scanner;

public class reverseofnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        String d="";
        int revrse=0;
        while(n>0){
            int rem=n%10;
            revrse=revrse*10+rem;
            n=n/10;
        }
        System.out.println(revrse);
    }
}
