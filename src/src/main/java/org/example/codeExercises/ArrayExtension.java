package org.example.codeExercises;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExtension {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter length of initial array: ");
        int baseArrayLength = sc.nextInt();
        int[] arr = generateRandomArray(baseArrayLength);
        int[] extendedArray = extendArray(arr);
        System.out.println("*** Initial array ***");
        System.out.println(Arrays.toString(arr));
        System.out.println("*** Extended array ***");
        System.out.println(Arrays.toString(extendedArray));
    }

    public static int[] extendArray(int[] arr){
        int newArrayLength = arr.length * 2;
        int[] extendedArray = Arrays.copyOf(arr, newArrayLength);
        for(int i = arr.length; i < newArrayLength; i++){
            extendedArray[i] = arr[i - arr.length] * 2;
        }
        return extendedArray;
    }
    public static int[] generateRandomArray(int amountOfElements){
        Random r = new Random();
        int[] initArray = new int[amountOfElements];
        for(int i = 0; i < amountOfElements; i++){
            initArray[i] = r.nextInt(100);
        }
        return initArray;
    }
}
