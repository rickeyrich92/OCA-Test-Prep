package org.example.codeExercises;

import java.util.Scanner;

//Program starts and asks user to input height of the rectangle
//
//After user inputs heights of the rectangle, program asks to input width of the rectangle.
//
//Program calls specific method which takes two parameters of int type which prints rectangle to the console:
//        ******
//
//        *      *
//
//        ******
//
//In the example above height of the rectangle is 3, the width of the rectangle is 6

public class EmptyRectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter height of rectangle: ");
        int height = sc.nextInt();
        System.out.print("Please, enter width of rectangle: ");
        int width = sc.nextInt();

        drawRectangle(height, width);
    }

    public static void drawRectangle(int height, int width) {
        for(int j = 0; j < height; j++){
            for(int i = 0; i < width; i++) {
                if(j == 0 || j == height - 1 || i == 0 || i == width - 1){
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }

            }
            System.out.println();
        }

    }

}
