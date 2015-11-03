/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import javax.swing.JOptionPane;

/**
 *
 * @author evanhoy
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        testCircle();
        testRectangle();
        testCylinder();
    }

    private static void testCircle() {
        double radius = Double.valueOf(JOptionPane.showInputDialog("what radius would you like?"));

        System.out.println(Circle.getArea(radius));
        System.out.println(Circle.getDiameter(radius));
        System.out.println(Circle.getCircumference(radius));
    }

    private static void testRectangle() {
        double width = Double.valueOf(JOptionPane.showInputDialog("what width would you like?"));
        double length = Double.valueOf(JOptionPane.showInputDialog("what length would you like?"));
        System.out.println(Rectangle.getPerimeter(width, length));
        System.out.println(Rectangle.getArea(width, length));

    }

    private static void testCylinder() {
        double radius = Double.valueOf(JOptionPane.showInputDialog("cylinder radius?"));
        double height = Double.valueOf(JOptionPane.showInputDialog("cylinder height?"));
        System.out.println(Cylinder.getVolume(radius, height));
    }
}
