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
public class NumberPalindrome {

  public static void main(String[] args) {
    int remainder = 0;
    int sum = 0;
    int temp = 0;
    //It is the number variable to be checked for palindrome  
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number: ");
    int inputNumber = sc.nextInt();
    temp = inputNumber;
    while (inputNumber > 0) {
      remainder = inputNumber % 10;  //getting remainder  
      sum = (sum * 10) + remainder;
      inputNumber = inputNumber / 10;
    }
    if (temp == sum) {
      System.out.println("Palindrome Number ");
    } else {
      System.out.println("Not a Palindrome");
    }
  }
}
