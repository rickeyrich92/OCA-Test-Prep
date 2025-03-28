package org.example.methods.squareAndRectangle;

public class Square extends Shape {
    protected int side;

    public Square(int side){
        if(side <= 0){
            throw new IllegalArgumentException();
        }
        this.side = side;
    }

    @Override
    public int calculateArea(){
        return side * side;
    }

    public void setSide(int side){
        this.side = side;
    }

}
