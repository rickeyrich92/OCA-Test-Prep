package org.example.operators;

public class LeftAndRightShift {
    public static void main(String[] args){
        // Left shifting a byte value
//        byte a = 64, b;
//        int i;
//
//        i = a << 2;
//        b = (byte) (a << 2);
//
//        System.out.println("Original value of a = " + a);
//        System.out.println("i and b: " + i + " " + b);

        // Left shifting as a quick way to multiply by 2
//        int i;
//        int num = 0xFFFFFFE;
//
//        for(i = 0; i < 4; i++){
//            num = num << 1;
//            System.out.println(num);
//        }

        // Masking sign extension
        char[] hex = {
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };

        byte b = (byte) 0xf1;
        System.out.println("b = 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f] );
    }


}
