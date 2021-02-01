/**
 * Quadratic.java
 * This program calculates the real (non-imaginary) roots of
 * a quadratic equation.
 * @author Dinh Nguyen
 * @version 2021-02-01
 */

import java.util.Scanner;

public class Quadratic
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Quadratic Equation Solver");
        System.out.println("I can solve ax^2 + bx + c = 0");
        System.out.print("Enter a: ");
        double a = in.nextDouble();
        System.out.print("Enter b: ");
        double b = in.nextDouble();
        System.out.print("Enter c: ");
        double c = in.nextDouble();
        double root1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        double root2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        System.out.println("The roots are:");
        System.out.println(root1);
        System.out.println(root2);
    }
}