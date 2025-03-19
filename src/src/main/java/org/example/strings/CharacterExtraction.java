package org.example.strings;

public class CharacterExtraction {
    static String arr[] = {
            "Now", "is", "the", "time", "for", "all", "good", "men",
            "to", "come", "to", "the", "aid", "of", "their", "country"
    };
    public static void main(String[] args) {
        String s = "This is a demo of the getChars method.";
        int start = 10;
        int end = 14;
        char buf[] = new char[end - start];

        s.getChars(start, end, buf, 0);
        System.out.println(buf);

        // Demonstrate equals() and equalsIgnoreCase()
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Good-bye";
        String s4 = "HELLO";

//        System.out.println(s1 + " equals " + s2 + " -> " +
//                s1.equals(s2));
//        System.out.println(s1 + " equals " + s3 + " -> " +
//                s1.equals(s3));
//        System.out.println(s1 + " equals " + s4 + " -> " +
//                s1.equals(s4));
//        System.out.println(s1 + " equals " + s4 + " -> " +
//                s1.equalsIgnoreCase(s4));

        // Demonstrate equals() vs ==
        String s5 = "Hello";
        String s6 = new String(s5);
//        System.out.println(s5 + " equals " + s6 + " -> " +
//                s5.equals(s6));
//        System.out.println(s5 + " == " + s6 + " -> " +
//                (s5 == s6));
        // bubble sort for Strings
//        for(int j = 0; j < arr.length; j++){
//            for(int i = j + 1; i < arr.length; i++){
//                if(arr[i].compareTo(arr[j]) < 0){
//                    String t = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = t;
//                }
//            }
//            System.out.println(arr[j]);

            String s7 = "Now is the time for all good men " +
            "to come to the aid of their country.";
            System.out.println(s7);
            System.out.println("indexOf(t) = " +
                    s7.indexOf('t'));
            System.out.println("lastIndexOf(t) = " +
                    s7.lastIndexOf('t'));
            System.out.println("indexOf(the) = " +
                    s7.indexOf("the"));
            System.out.println("lastIndexOf(the) = " +
                    s7.lastIndexOf("the"));
            System.out.println("indexOf(t, 10) = " +
                    s7.indexOf('t', 10));
            System.out.println("lastIndexOf(t, 60) = " +
                    s7.lastIndexOf('t', 60));
            System.out.println("indexOf(the, 10) = " +
                    s7.indexOf("the", 10));
            System.out.println("lastIndexOf(the, 60) = " +
                    s7.lastIndexOf("the", 60));
        //}
    }
}
