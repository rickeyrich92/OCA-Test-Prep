package org.example.codeExercises;

import java.util.Scanner;

public class CircleCircumference {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the circle radius: ");
        double a = sc.nextDouble();
        double circleCircumference = 2 * Math.PI * a;

        System.out.println("The circle circumference is: " + circleCircumference);
    }

}
