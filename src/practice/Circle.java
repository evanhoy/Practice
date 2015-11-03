/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author evanhoy
 */
public class Circle {

    public static double getArea(double Radius) {
        return 3.14 * Radius * Radius;
    }

    public static double getDiameter(double Radius) {
        return 2 * Radius;
    }

    public static double getCircumference(double radius) {
        return 2 * 3.14 * radius;
    }
}
