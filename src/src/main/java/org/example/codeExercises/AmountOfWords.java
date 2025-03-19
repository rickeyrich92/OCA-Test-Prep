package org.example.codeExercises;

import java.util.Scanner;

//Program starts and asks user to enter text.
//
//Program calls specific function which take one parameter of String type
// and returns amount of words in the text.
//
//Method should look like this:
//public static int getWordsAmount(String text) {
//<write your code here>
//}
//
//
//Program prints amount of words to the console.

public class AmountOfWords {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any text: ");
        String userInput = sc.nextLine();
        int amountOfWords = getWordsAmount(userInput);


        System.out.println("Amount of words in your text: " + amountOfWords);
    }


    public static int getWordsAmount(String text) {
        int counter = 1;
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == ' '){
                counter++;
            }
        }
		return counter;
    }
}
