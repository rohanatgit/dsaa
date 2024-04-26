package vvdn;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int res=0;
        while(temp>0){
          int rem=temp%10;
           res=res*10+rem;
           temp/=10;
        }
        if(n==res){
            System.out.println("yes");
        }
        else {
            System.out.println("No");
        }
    }
}
