package vvdn;

import java.util.Scanner;

public class Fiboo {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      int n=sc.nextInt();
      int a=0;
      int b=1;
      for(int i=1;i<=n;i++){
          System.out.println(a);
          int nt=a+b;
          a=b;
          b=nt;
      }
    }
}
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the number of terms: ");
//        int n = scanner.nextInt();
//
//        System.out.println("Fibonacci series:");
//        for (int i = 0; i < n; i++) {
//            System.out.print(fibonacci(i) + " ");
//        }
//    }
//
//    // Recursive function to calculate the nth Fibonacci number
//    public static int fibonacci(int n) {
//        if (n <= 1) {
//            return n;
//        } else {
//            return fibonacci(n - 1) + fibonacci(n - 2);
//        }
//    }
