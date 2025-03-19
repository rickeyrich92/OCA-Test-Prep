package org.example.strings;

public class MiscellaneousMethods {
    // Demonstrate append()
    public static void main(String[] args){
        String s;
        int a = 42;
        StringBuffer sb = new StringBuffer(40);

        s = sb.append("a = ").append(a).append("!").toString();
        System.out.println(s);

        // Demonstrate insert()
        StringBuffer sb2 = new StringBuffer("I Java!");

        sb2.insert(2, "like ");
        System.out.println(sb2);

        // Demonstrate reverse()
        StringBuffer sb3 = new StringBuffer("abcdef");
        System.out.println(sb3);
        sb3.reverse();
        System.out.println(sb3);

        // Demonstrate delete() and deleteCharAt()
        StringBuffer sb4 = new StringBuffer("This is a test.");
        sb4.delete(4,7);
        System.out.println("After delete: " + sb4);

        sb4.deleteCharAt(0);
        System.out.println("After deleteCharAt: " + sb4);

        // Demonstrate replace()
        StringBuffer sb5 = new StringBuffer("This is a test.");
        sb5.replace(5,7,"was");
        System.out.println("After replace: " + sb5);
    }
}
