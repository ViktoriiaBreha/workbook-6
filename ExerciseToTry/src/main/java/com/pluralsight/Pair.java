package com.pluralsight;

public class Pair <T extends Musician>{
    // A pair contains two objects
    private T leftThing;
    private T rightThing;
    Pair(T leftThing, T rightThing) {
        this.leftThing = leftThing;
        this.rightThing = rightThing;
    }
    public T getLeftThing() {
        return this.leftThing;
    }
    public T getRightThing() {
        return this.rightThing;
    }
    public void swap() {
        T temp = leftThing;
        rightThing = leftThing;
        leftThing = rightThing;
    }
    public void perform() {
// we cannot guarantee that the left and right things
// have a perform method defined
// these lines of code would not compile
        leftThing.perform(); //error
        rightThing.perform(); //error
    }
}

