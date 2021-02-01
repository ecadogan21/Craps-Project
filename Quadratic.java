/**
 * Quadratic.java
 * This program calculates the real (non-imaginary) roots of
 * a quadratic equation.
 * @author Dinh Nguyen
 * @version 2021-01-31
 */

import java.util.Scanner;

public class Quadratic
{

    public static double discriminant(double a, double b, double c)
    {
        return b * b - 4 * a * c;
    }

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
        double disc = discriminant(a, b, c);
        if (disc > 0)
        {
            System.out.println((-b + Math.sqrt(disc)) / (2 * a));
            System.out.println((-b - Math.sqrt(disc)) / (2 * a));
        }
        else if (disc == 0)
        {
            System.out.println((-b + Math.sqrt(disc)) / (2 * a));
        }
        else
        {
            System.out.println("No real solutions for this equation.");
        }
    }
}