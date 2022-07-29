package com.LIneComparsion;

import java.util.Scanner;

public class LineComparisonuc1 {
    public static void main(String[] args) {
        double X1, X2, Y1, Y2, Lenghtofline;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter point of X1");
        X1 = sc.nextDouble();
        System.out.println("Enter point of X2");
        X2 = sc.nextDouble();
        System.out.println("Enter point of Y1");
        Y1 = sc.nextDouble();
        System.out.println("Enter point of Y2");
        Y2 = sc.nextDouble();

        Lenghtofline = Math.sqrt( (Math.pow((X2-X1),2)) + (Math.pow((Y2-Y1),2)) );
        System.out.println(Lenghtofline);
    }
}


