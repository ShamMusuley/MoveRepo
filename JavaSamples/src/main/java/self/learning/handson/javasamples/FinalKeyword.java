/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.javasamples;

/**
 *
 * @author Dell
 */
public class FinalKeyword {
    public static final int[] arr = {1, 2, 3};
    public static void main(String[] args) {
        System.out.println("First element in arr: " + arr[0]);
        FinalKeyword.arr[0] = 5;
        // This is possible with final reference variables.
        // Here only the value of 1st element in arr is changed, not the arr.
        System.out.println("First element in arr: " + arr[0]);
    }
}
