/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.gkginfo.lecture;

/**
 *
 * @author andre Assignment: FooCorporation Method to print pay based on base
 * pay and hours worked Overtime: More than 40 hours, paid 1.5 times base pay
 * Minimum Wage: $8.00/hour Maximum Work: 60 hours a week
 */
public class Lecture02 {


    public void fooCorporationPayment(double basePay, int hoursWorked) {
        if (basePay < 8.0) {
      System.out.println("You must be paid at least $8.00/hour");
        } else if (hoursWorked > 60) {
      System.out.println("You can't work more than 60 hours a week");
        } else {
            int overtimeHours = 0;
            if(hoursWorked > 40) {
                overtimeHours = hoursWorked - 40;
                hoursWorked = 40;
            }
            double pay = basePay * hoursWorked;
            pay += overtimeHours * basePay * 1.5;
      System.out.println("Pay this employee $"+pay);
        }

    }

}
