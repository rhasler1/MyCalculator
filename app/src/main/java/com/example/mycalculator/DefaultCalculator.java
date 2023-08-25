package com.example.mycalculator;

public class DefaultCalculator implements Calculator<Double> {

    /* method to add */
    public Double doSum(double x, double y) {
        double sum = x + y;
        return sum;
    }

    /* method to subtract */
    public Double doSub(double x, double y) {
        double dif = x - y;
        return dif;
    }

    /* method to multiply */
    public Double doMul(double x, double y) {
        double prod = x * y;
        return prod;
    }

    /* method to divide */
    public Double doDiv(double x, double y) {
        double quot = x / y;
        return quot;
    }

    /* method to find remainder/modulus */
    public Double doMod(double x, double y) {
        double mod = x % y;
        return mod;
    }

    /* method to find power of result */
    public Double doPow(double x, double y) {
        double prod = Math.pow(x,y);
        return prod;
    }

}