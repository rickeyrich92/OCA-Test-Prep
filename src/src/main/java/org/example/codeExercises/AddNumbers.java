package org.example.codeExercises;

public class AddNumbers {
    public static void main(String[] args){
        if(args[0].contains(".") || args[1].contains(".")){
            double int1 = Double.parseDouble(args[0]);
            double int2 = Double.parseDouble(args[1]);
            System.out.println(int1 + int2);
        } else{
            int int3 = Integer.parseInt(args[0]);
            int int4 = Integer.parseInt(args[1]);
            System.out.println(int3 + int4);
        }
    }
}
