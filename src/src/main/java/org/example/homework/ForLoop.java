package org.example.homework;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args){
        System.out.println("Please enter an integer: ");
        Scanner sc = new Scanner(System.in);

        String userInput = sc.nextLine();

        for(int i = 0; i < userInput.length(); i++){
            System.out.println(userInput.charAt(i));
        }
    }
}
