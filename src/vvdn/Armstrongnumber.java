package vvdn;

import java.util.Scanner;

public class Armstrongnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        for(int i=s;i<=e;i++) {
            if (isArm(i)) {
                System.out.println(i + " Arm");}

        }
    }
    public static boolean isArm(int num){
        int originalnumber=num;
        int numofdigits=String.valueOf(num).length();
        int s=0;
        while(num>0){
            int digit=num%10;
            s+=Math.pow(digit,numofdigits);
            num/=10;
        }
        return s==originalnumber;
    }
}
