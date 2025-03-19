package org.example.codeExercises;

import java.util.Scanner;

public class SumDigitsNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter integer: ");
        int number = sc.nextInt();

        int sumOfDigits = sumDigitsNumber(number);
        System.out.println(sumOfDigits);
    }

    public static int sumDigitsNumber(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number = number /= 10;
        }
        return sum;
    }

}
