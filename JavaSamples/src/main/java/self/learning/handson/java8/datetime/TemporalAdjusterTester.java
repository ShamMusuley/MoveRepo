/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.java8.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 *
 * @author DT234016
 */
public class TemporalAdjusterTester {

  public static void main(String args[]) {
    TemporalAdjusterTester java8tester = new TemporalAdjusterTester();
    java8tester.testAdjusters();
  }

  public void testAdjusters() {
    //Get the current date
    LocalDate date1 = LocalDate.now();
    System.out.println("Current date: " + date1);

    //get the next tuesday
    LocalDate nextTuesday = date1.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
    System.out.println("Next Tuesday on : " + nextTuesday);

    //get the second saturday of next month
    LocalDate firstInYear = LocalDate.of(date1.getYear(), date1.getMonth(), 1);
    LocalDate secondSaturday = firstInYear.with(TemporalAdjusters.nextOrSame(
            DayOfWeek.SATURDAY)).with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
    System.out.println("Second Saturday on : " + secondSaturday);
  }
}
