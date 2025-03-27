package org.example.codingChallenges;

import java.util.Arrays;
import java.util.List;

public class gridChallenge {
    public static String gridChallenge(List<String> grid) {
        // StringBuilder sb = new StringBuilder("");


        // for loop to set individual row alphabetically
        for(int i = 0; i < grid.size(); i++){
            // will iterate through turning each row into an array to sort by collections
            char[] row = grid.get(i).toCharArray();
            // sorting the new array
            Arrays.sort(row);
            // setting input of first row equal to char[] and making a new string
            grid.set(i, new String(row));
        }


        // 2D [][] to check the columns horizontally
        for(int i = 0; i < grid.get(0).length(); i++){
            // iterating through the individual columns
            for(int j = 1; j < grid.size(); j++){
                // checking to make sure the element at "j" > the element at "i" (checking that index[1] > index[0])
                // if it passes, both elements move to the next index for the check
                // if it fails, code exits and returns "NO" because it is false
                if(grid.get(j).charAt(i) < grid.get(j - 1).charAt(i)){
                    return "NO";
                }
            }
        }
        return "YES";

    }
}
