package vvdn;

import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int s=sc.nextInt();
      int e=sc.nextInt();
      for(int i=s;i<=e;i++) {
          if (isprime(i)) {
              System.out.println(i + " ");}
//          } else {
//              System.out.println( + "is not prime");
//          }
      }
    }
    public static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
