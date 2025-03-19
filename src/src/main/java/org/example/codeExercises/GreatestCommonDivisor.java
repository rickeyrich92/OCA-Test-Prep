package org.example.codeExercises;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter two numbers separated by space: ");
        String userInput = sc.nextLine();

        String[] inputArgumentsArray = userInput.split("\\s+");
        int num1 = Integer.parseInt(inputArgumentsArray[0]);
        int num2 = Integer.parseInt(inputArgumentsArray[1]);

        System.out.println(gcdRecursive(num1, num2));
    }

    public static int gcdRecursive(int firstNumber, int secondNumber){
        if(secondNumber == 0){
            return Math.abs(firstNumber);
        } else{
            return gcdRecursive(secondNumber, firstNumber % secondNumber);
        }
    }
}
