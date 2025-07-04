package com.sample.main;

public class Main {

  public static void main(String[] args) {
    int numberToCalculate = 5;

    try {
      long result = FactorialCalculator.calculateFactorial(numberToCalculate);
      System.out.println(numberToCalculate + " の階乗は " + result + " です。");

    } catch (IllegalArgumentException e) {
      // 引数が不正な場合のエラーメッセージを表示
      System.err.println("エラー: " + e.getMessage());
    }
  }
}