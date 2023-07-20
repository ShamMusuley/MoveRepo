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
public class StringPalindrome {

  public static void main(String[] args) {
    // Scanner to read input values
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the input String: ");
    String inputString = sc.next();
    // Convert the string to lowercase
    inputString = inputString.toLowerCase();
    // passing bool function till holding true
    if (isPalindrome(inputString)) {
      // It is a palindrome
      System.out.print("Yes");
    } else {
      // Not a palindrome
      System.out.print("No");
    }
  }

  // Returning true if string is palindrome
  static boolean isPalindrome(String str) {
    // Pointers pointing to the beginning
    // and the end of the string
    int i = 0;
    int j = str.length() - 1;

    // While there are characters to compare
    while (i < j) {
      // If there is a mismatch
      if (str.charAt(i) != str.charAt(j)) {
        return false;
      }
      // Increment first pointer and
      // decrement the other
      i++;
      j--;
    }
    // Given string is a palindrome
    return true;
  }
}
