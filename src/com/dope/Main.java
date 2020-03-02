package com.dope;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        //zadanie1();
        //zadanie2();
        zadanie3();
    }

    private static void zadanie1() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = in.nextInt();
        System.out.println("Enter b: ");
        double b = in.nextInt();
        System.out.println("Enter c: ");
        double c = in.nextInt();

        double answer = b + (sqrt(pow(b, 2) + 4 * a * c));
        System.out.println("OTBET: " + answer);
    }

    private static void zadanie2() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = in.nextInt();
        System.out.println("Enter b: ");
        double b = in.nextInt();
        double t = 0;
        if (b == 0)
        System.out.println("Your'e stupid!");
        else
            t = a / b;
            System.out.println("Answer: " + t);
    }

    private static void zadanie3() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter sum: ");
        double a = in.nextInt(), d = 0;

        if (a > 1000)
            d = 5;
        else
        if (a > 500)
            d = 3;
        else
            d = 0;
        System.out.println("Total: " + ( a - a * d / 100) );
    }


}