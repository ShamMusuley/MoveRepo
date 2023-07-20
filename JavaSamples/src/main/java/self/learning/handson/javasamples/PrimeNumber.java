/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.javasamples;

import java.util.Scanner;

/**
 *
 * @author DT234016
 */
public class PrimeNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number: ");
    int number = sc.nextInt();
    if (isPrime(number)) {
      System.out.println("Prime Number");
    } else {
      System.out.println("Not a Prime Number");
    }
  }

  static boolean isPrime(int n) {
    // Corner case
    if (n <= 1) {
      return false;
    }

    // Check from 2 to sqrt(n)
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
