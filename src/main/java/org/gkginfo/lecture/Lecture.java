/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.gkginfo.lecture;
/**
 * @author andre
 */
public class Lecture {

  public static void main(String[] args) {
    Lecture01 lec01 = new Lecture01();
    Lecture02 lec02 = new Lecture02();
    Lecture03 lec03 = new Lecture03();

    System.out.println("!!");
    System.out.println("Lec01> " + lec01.gravityCalculator());
    System.out.println("Lec01> " + lec01.gravityCalculator(-9.81, 20.0));
    System.out.println("");
    System.out.println("Lec02> 7.5, 35h");
    lec02.fooCorporationPayment(7.5, 35);
    System.out.println("Lec02> 8.2, 47h");
    lec02.fooCorporationPayment(8.2, 47);
    System.out.println("Lec02> 10.0, 73h");
    lec02.fooCorporationPayment(10.0, 73);
    System.out.println("");
    double[] person = {12.1, 7.2, 4.3};
    lec03.firstAndSecondBestPerformer(person);


  }
}
