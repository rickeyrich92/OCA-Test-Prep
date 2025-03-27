package org.example.codingChallenges;

import java.util.Arrays;

public class biggerIsGreater {
    public static String biggerIsGreaterMethod(String w) {
        char[] charArray = w.toCharArray();
        int n = charArray.length;
        int index = -1;
        int switchIndex = -1;

        for(int i = n - 2; i >= 0; i--){
            if(charArray[i] < charArray[i + 1]){
                index = i;
                break;
            }
        }

        if(index == -1){
            return "no answer";
        }

        for(int i = n - 1; i > index; i--){
            if(charArray[i] > charArray[index]){
                switchIndex = i;
                break;
            }
        }

        char temp = charArray[index];
        charArray[index] = charArray[switchIndex];
        charArray[switchIndex] = temp;
        Arrays.sort(charArray, index + 1, n);

        return new String(charArray);

    }

}

