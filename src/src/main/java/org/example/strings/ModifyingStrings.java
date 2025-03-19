package org.example.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ModifyingStrings {
    public static void main(String[] args) throws IOException{
        // Substring replacement
        String org = "This is a test. This is, too.";
        String search = "is";
        String sub = "was";
        String result = "";
        int i;

        do { //replace all matching substrings
            System.out.println(org);
            i = org.indexOf(search);

            if (i != -1){
                result = org.substring(0, i);
            result = result + sub;
            result = result + org.substring(i, search.length());
            org = result;
        }
        } while(i != -1);

        String s1 = "one";
        String s2 = s1.concat("two");
        System.out.println(s2);

        // Using trim() to process commands
        // create a BufferReader using System.in
        BufferedReader br = new
                BufferedReader(new InputStreamReader(System.in));
        String str;

        System.out.println("Enter 'stop' to quit.");
        System.out.println("Enter State: ");
        do{
            str = br.readLine();
            str = str.trim(); // remove whitespace

            if(str.equals("Illinois"))
                System.out.println("Capital is Springfield");
            else if(str.equals("Missouri"))
                System.out.println("Captial is Jefferson City");
            else if(str.equals("California"))
                System.out.println("Captial is Sacremento");
            else if(str.equals("Washington"))
                System.out.println("Captial is Olympia");
        } while(!str.equals("stop"));

    }
}
