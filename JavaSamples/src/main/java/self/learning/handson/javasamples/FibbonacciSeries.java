package self.learning.handson.javasamples;

import java.util.Scanner;

public class FibbonacciSeries {
    public static void main(String[] args) {
        // Scanner object used to read input values.
        Scanner sc = new Scanner(System.in);
        // declare variables
        int limit = 0;
        int firstNo = 0;
        int secondNo = 1;
        int nextNo = 0;
        // read limit from user
        System.out.println("Enter the limit : ");
        limit = sc.nextInt();
        // print fibonacci series
        System.out.println("Fibonacci Series Upto " + limit + ": ");
        for (int i = 1; i <= limit; i++) {
            System.out.print(firstNo);
            if (i != limit) {
                System.out.print(", ");
            }
            // compute the next term
            nextNo = firstNo + secondNo;
            firstNo = secondNo;
            secondNo = nextNo;
        }
    }
}
