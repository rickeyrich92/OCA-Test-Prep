package org.example.strings;

public class StringConstructors {
    public static void main(String[] args){
        // Construct one string from another
        char c[] = {'J', 'a', 'v', 'a'};
        String s1 = new String(c);
        String s2 = new String(s1);

        System.out.println(s1);
        System.out.println(s2);

        // Construct a string from subset of char array
        byte ascii[] = {65, 66, 67, 68, 69, 70};

        String s3 = new String(ascii);
        System.out.println(s3);

        String s4 = new String(ascii, 2, 3);
        System.out.println(s4);
    }
}
