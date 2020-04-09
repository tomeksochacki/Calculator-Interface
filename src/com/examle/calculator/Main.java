package com.examle.calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(1, 5);
        double scoreAdds = calculator.adds();
        System.out.println(scoreAdds);
        double scoreDividet = calculator.dividet();
        System.out.println(scoreDividet);
        double scoreSubstracts = calculator.substracts();
        System.out.println(scoreSubstracts);
        double scoreMultiplies = calculator.multiplies();
        System.out.println(scoreMultiplies);

    }
}
