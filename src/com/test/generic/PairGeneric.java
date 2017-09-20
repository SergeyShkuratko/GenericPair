package com.test.generic;

public class PairGeneric<T extends Number,F extends Number> {

    private T first;
    private F second;

    public PairGeneric(T first, F second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(F second) {
        this.second = second;
    }

    public Number summ(){
        return first.doubleValue() + second.doubleValue() ;
    }

    public Number division(){
        return first.doubleValue() / second.doubleValue();
    }

    public Number subtraction(){
        return first.doubleValue() - second.doubleValue();
    }

    public Number multiplication(){
        return first.doubleValue() * second.doubleValue();
    }
}
