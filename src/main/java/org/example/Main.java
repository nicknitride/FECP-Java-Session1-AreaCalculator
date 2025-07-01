package org.example;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static double calculateCircleArea(double radius){
        DecimalFormat radFormat = new DecimalFormat("#.00");
        System.out.println("Area of the circle: "+radFormat.format(Math.pow((radius),2)*3.14159));
        return (Math.pow((radius),2)*3.14159);
    }
    public static double calculateTriangleArea(double base, double height){
        double result = (base*height)/2;
        DecimalFormat radFormat = new DecimalFormat("#.00");
        System.out.println("Area of the triangle: "+radFormat.format(result));
        return result;
    }
    public static double calculateRectangleArea(double length, double width){
        double result = width*length;
        DecimalFormat radFormat = new DecimalFormat("#.00");
        System.out.println("Area of the rectangle: "+radFormat.format(result));
        return result;
    }
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.println("=== Area Calculator ===");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.print("Choose a shape (1-3): ");
        int userChoice = userIn.nextInt();
        if(userChoice==1){
            System.out.print("Enter the radius: ");
            double radius = userIn.nextDouble();
            calculateCircleArea(radius);
        } else if (userChoice==2) {
            System.out.print("Enter the base: ");
            double base = userIn.nextDouble();
            System.out.print("Enter the height: ");
            double height = userIn.nextDouble();
            calculateTriangleArea(base,height);
        } else if (userChoice == 3) {
            System.out.print("Enter the length: ");
            double length = userIn.nextDouble();
            System.out.print("Enter the width: ");
            double width = userIn.nextDouble();
            calculateRectangleArea(length,width);
        }
    }
}