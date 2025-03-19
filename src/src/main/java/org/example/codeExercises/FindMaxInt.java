package org.example.codeExercises;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter integer numbers separated by space: ");
        String userInput = sc.nextLine();
        int[] intArray = convertInteger(userInput.split("\\s+"));
        int maxInt = findMaxIntInArray(intArray);


        System.out.println("*** Initial Array ***");
        System.out.println(Arrays.toString(intArray));
        System.out.println("*** Max number in array ***");
        System.out.println(maxInt);
    }

    public static int findMaxIntInArray(int[] intArray){
        int maxInt = 0;

        for(int i = 0; i < intArray.length; i++){
            if(intArray[i] > maxInt){
                maxInt = intArray[i];
            }
        }
        return maxInt;
    }

    private static int[] convertInteger(String[] stringArray){
        int[] intArray = new int[stringArray.length];
        for(int i = 0; i < stringArray.length; i++){
            intArray[i] = Integer.valueOf(stringArray[i]);
        }
        return intArray;
    }
}
