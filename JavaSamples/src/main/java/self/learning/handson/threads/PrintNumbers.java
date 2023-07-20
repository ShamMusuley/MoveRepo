/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.threads;

import java.util.Scanner;

/**
 *
 * @author DT234016
 */
public class PrintNumbers {
  // Starting counter
    int counter = 1;
 
    static int number;
 
    // Function to print odd numbers
    public void printOddNumber()
    {
        synchronized (this)
        {
            // Print number till the N
            while (counter < number) {
                // If count is even then print
                while (counter % 2 == 0) {
                    // Exception handle
                    try {
                        wait();
                    }
                    catch (
                        InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // Print the number
                System.out.print(counter + " ");
                // Increment counter
                counter++;
                // Notify to second thread
                notify();
            }
        }
    }
 
    // Function to print even numbers
    public void printEvenNumber()
    {
        synchronized (this)
        {
            // Print number till the N
            while (counter < number) {
                // If count is odd then print
                while (counter % 2 == 1) {
                    // Exception handle
                    try {
                        wait();
                    }
                    catch (
                        InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // Print the number
                System.out.print(
                    counter + " ");
                // Increment counter
                counter++;
                // Notify to 2nd thread
                notify();
            }
        }
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last number to print: ");
        number = sc.nextInt();
 
        // Create an object of class
        PrintNumbers pn = new PrintNumbers();
 
        // Create thread t1
        Thread t1 = new Thread(() -> {
          pn.printEvenNumber();
        });
 
        // Create thread t2
        Thread t2 = new Thread(() -> {
          pn.printOddNumber();
        });
 
        // Start both threads
        t1.start();
        t2.start();
    }
}
