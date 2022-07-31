package com.LIneComparsion;

import java.util.Scanner;

public class LineComparisonuc3 {
    public static void main(String[] args) {
        double X1;
        double X2;
        double Y1;
        double Y2;
        double Lenghtofline1;
        double Lenghtofline2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter point of X1");
        X1 = sc.nextDouble();
        System.out.println("Enter point of X2");
        X2 = sc.nextDouble();
        System.out.println("Enter point of Y1");
        Y1 = sc.nextDouble();
        System.out.println("Enter point of Y2");
        Y2 = sc.nextDouble();

        Lenghtofline1 = Math.sqrt((Math.pow((X2 - X1), 2)) + (Math.pow((Y2 - Y1), 2)));
        System.out.println("Length of Line1: " + Lenghtofline1);

        System.out.println("Enter point of X1");
        X1 = sc.nextDouble();
        System.out.println("Enter point of X2");
        X2 = sc.nextDouble();
        System.out.println("Enter point of Y1");
        Y1 = sc.nextDouble();
        System.out.println("Enter point of Y2");
        Y2 = sc.nextDouble();

        Lenghtofline2 = Math.sqrt((Math.pow((X2 - X1), 2)) + (Math.pow((Y2 - Y1), 2)));
        System.out.println("Length of Line2: " + Lenghtofline2);

        String s1, s2;
        s1 = Double.toString(Lenghtofline1);
        s2 = Double.toString(Lenghtofline2);
        System.out.println("equality of two lines using Equal method: " + s1.equals(s2));
        System.out.println("Compare of two length is: " + s1.compareTo(s2));
    }
}

