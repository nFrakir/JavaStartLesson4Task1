package com.gmail.seliverstova.hanna;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        double x;
        double y;
        double length;

        System.out.println("Input x and press Enter");
        x = sc.nextDouble();
        System.out.println("Input y and press Enter");
        y = sc.nextDouble();

        length = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        if (length >= 4.0) {
            System.out.println("Dot is out of circle");
        } else {
            System.out.println("Dot is inside circle");
        }

    }
}
