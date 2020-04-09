package com.examle.calculator;

public class Calculator implements CanAdds, CanDividet, CanMultiplies, CanSubstracts {
    private double x;
    private double y;

    public Calculator(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public double adds() {
        return x+y;
    }

    @Override
    public double multiplies() {
        return x*y;
    }

    @Override
    public double dividet() {
        return x/y;
    }

    @Override
    public double substracts() {
        return x-y;
    }
}
