package org.example.methods.workerRefactor;

//Class implementing relevant interface
public class Robot implements Workable {
    @Override
    public void work(){
        System.out.println("Robot is working");
    }
}
