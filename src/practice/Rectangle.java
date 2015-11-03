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
public class Rectangle {

    public static double getArea(double width, double length) {
        return width * length;
    }

    public static double getPerimeter(double width, double length) {
        return 2 * width + 2 * length;
    }

    public static boolean inSquare(double width, double length) {
        return (width == length);
    }

}
