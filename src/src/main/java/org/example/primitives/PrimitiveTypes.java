package org.example.primitives;


public class PrimitiveTypes {

    /* Data Types : Primitive types and Reference types
    Primitives:
        Integers
        Floating-point number
        Booleans
        Characters

        Every variable has a type
        Every expression has a type
        Each type is strictly defined

        variable - piece of memory that contains data value
        Java is strongly typed
        variable is defined by combination of identifier and type
     */

    public static void main(String[] args){
        byte b = 1;
        short s;
        s = 2;
        int i = 3;
        long l = 4;

        char c = 'a';

        boolean bool = true;

        float f = 1.2f;

        double d = 3.4;

        var v = 1;

        char c2 = 100;
        // System.out.println(c2);

        Integer i4 = 1;
        int i5 = i4;

        // Compute the distance light travels using long variables
        int lightspeed;
        long days;
        long seconds;
        long distance;

        // approximate speed of light in miles per second
        lightspeed = 186000;

        days = 1000; // specify number of days

        seconds = days * 24 * 60 * 60; // convert to seconds

        distance = lightspeed * seconds; //compute distance

//        System.out.print("In " + days);
//        System.out.print(" days light will travel about ");
//        System.out.println(distance + " miles");

        // demonstrate double type
        // compute the area of a circle
        double pi, r, a;

        r = 10.8; // radius of the circle
        pi = 3.1416; // value of pi
        a = pi * r * r; // compute area

        // System.out.println("Area of circle is " + a);

        // demonstrate char type
        char ch1, ch2;

        ch1 = 88; // unicode for X
        ch2 = 'Y';

        // System.out.println("ch1 and ch2: " + ch1 + " " + ch2);

        // char variables behave like integers
        char ch3;

        ch3 = 'X';
        System.out.println("ch3 contains " + ch3);

        ch3++; // increment ch3
        System.out.println("ch3 is now " + ch3);

        // demonstrate boolean values
        boolean bi;

//        bi = false;
//        System.out.println("bi is " + bi);
//        bi = true;
//        System.out.println("bi is " + bi);
//
//        // a boolean value van control the if statement
//        if(bi) System.out.println("This is executed");
//
//        bi = false;
//        if(bi) System.out.println("This is not executed");
//
//        // outcome of a relational operator is a boolean value
//        System.out.println("10 > 9 is " + (10 > 9));

        // demonstrate dynamic initialization
        double g = 3.0, h = 4.0;

        // 'j' is dynamically initialized
        double j = Math.sqrt(g*g + h*h);
        // System.out.println("Hypotenuse is " + j);

        // demonstrate block scope
        int x;

        x = 10;
        if(x == 10){
            int y = 20;
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
    }

}



