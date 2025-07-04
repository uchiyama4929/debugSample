package com.sample.main;

public class FactorialCalculator {

 public static long calculateFactorial(int n) {
     if ( n < 0 ) {
         throw new IllegalArgumentException("負の数の階乗は定義されていません。");
     }
     if ( n == 0 || n == 1 ) {
         return 1;
     }

     long factorial = 1;

     for (int i = 1; i <= n; i++ ) {
         factorial *= i;
     }
     return factorial;
 }
}