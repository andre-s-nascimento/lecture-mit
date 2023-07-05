/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.gkginfo.lecture;

/**
 *
 * @author andre Assignment: GravityCalculator Compute the position of a falling
 * object: x(t) = 0.5 × a*t^2 + vi*t + xi
 */
public class Lecture01 {

    public String gravityCalculator() {
        double gravity = -9.81; // a
        double fallingTime = 10.0; // t
        double initialVelocity = 0.0; // vi
        double initialPosition = 0.0; // xi
        double finalPosition;
        finalPosition = (0.5 * (gravity) * (fallingTime * fallingTime)
                + (initialVelocity * fallingTime) + (initialPosition));
        System.out.println("An object's position with initial velocity: "
                + initialVelocity + " at initial position: "
                + initialPosition + " after "
                + fallingTime + " seconds is "
                + finalPosition + "m");
        return "An object's position with initial velocity: "
                + initialVelocity + " at initial position: "
                + initialPosition + " after "
                + fallingTime + " seconds is "
                + finalPosition + "m";
    }

    public String gravityCalculator(double gravity, double fallingTime) {
        double initialVelocity = 0.0; // vi
        double initialPosition = 0.0; // xi
        double finalPosition;
        finalPosition = (0.5 * (gravity) * (fallingTime * fallingTime)
            + (initialVelocity * fallingTime) + (initialPosition));
//        System.out.println("An object's position with initial velocity: "
//            + initialVelocity + " at initial position: "
//            + initialPosition + " after "
//            + fallingTime + " seconds is "
//            + finalPosition + "m");
        return "An object's position with initial velocity: "
            + initialVelocity + " at initial position: "
            + initialPosition + " after "
            + fallingTime + " seconds is "
            + finalPosition + "m";
    }
}
