package org.example.codeExercises;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter A side of a triangle: ");
        double i = sc.nextDouble();
        System.out.println("Please, enter B side of a triangle: ");
        double j = sc.nextDouble();
        System.out.println("Please, enter C side of a triangle: ");
        double k = sc.nextDouble();
        double l = (i+j+k)/2;

        double triangleArea = Math.sqrt(l * (l - i) * (l - j) * (l - k));
        System.out.println("Triangle area is: " + triangleArea);

    }
}
