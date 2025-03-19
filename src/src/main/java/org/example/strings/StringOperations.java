package org.example.strings;

public class StringOperations {
    double width;
    double height;
    double depth;
    StringOperations(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    public String toString(){
        return "Dimensions are " + width + " by " +
                depth + " by " + height + ".";
    }
}

class toStringDemo{
    public static void main(String[] args){
        StringOperations so = new StringOperations(10,12,14);
        String s = "Box b: " + so;

        System.out.println(so);
        System.out.println(s);
    }
}
