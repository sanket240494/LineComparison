package com.LIneComparsion;

import java.util.Scanner;

public class LineComparisonuc4 {
    public static int distance() {
        float x1;
        float x2;
        float y1;
        float y2;
        double dis;
        System.out.println("Enter the first line Endpoints");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 Point");
        x1 = sc.nextInt();
        System.out.println("Enter y1 Point");
        y1 = sc.nextInt();
        System.out.println("Enter x2 Point");
        x2 = sc.nextInt();
        System.out.println("Enter y2 Point");
        y2 = sc.nextInt();
        dis = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distance Between " + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + "),==>" + dis);
        int a = (int) dis;
        return a;
    }

    public static int distance2() {

        float a1;
        float a2;
        float b1;
        float b2;
        double dis2;
        System.out.println("Enter the Second Line Endpoints");
        Scanner sc = new Scanner(System.in);
        a1 = sc.nextInt();
        System.out.println("Enter y1 Point");
        b1 = sc.nextInt();
        System.out.println("Enter x2 Point");
        a2 = sc.nextInt();
        System.out.println("Enter y2 Point");
        b2 = sc.nextInt();
        dis2 = Math.sqrt(Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2));
        System.out.println("Distance Between " + "(" + a1 + "," + b1 + ")," + "(" + a2 + "," + b2 + "),==>" + dis2);
        int b = (int) dis2;
        return b;

    }

    public static void equal(int a, int b) {
        if (a == b)
            System.out.println("Line Length l1" + a + "and Line Length l2" + b + "Equals");

    }

    public static void greater(int a, int b) {
        if (a > b)
            System.out.println("Line Length l1 : " + a + " " + "Is greater than Line Length l2 : " + b);
    }

    public static void less(int a, int b) {
        System.out.println("Line Length l1 : " + a + " " + "Is Less than Line Length l2 : " + b);

    }

    public static void main(String[] args) {
        int a = distance();
        int b = distance2();
        equal(a, b);
        greater(a, b);
        less(a, b);
    }
}
