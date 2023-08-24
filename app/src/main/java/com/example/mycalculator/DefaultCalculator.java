package com.example.mycalculator;

public class DefaultCalculator implements Calculator<Integer> {

    /* method to add */
    public Integer doSum(int x, int y) {
        int sum = x + y;
        return sum;
    }

    /* method to subtract */
    public Integer doSub(int x, int y) {
        int dif = x - y;
        return dif;
    }

    /* method to multiply */
    public Integer doMul(int x, int y) {
        int prod = x * y;
        return prod;
    }

    /* method to divide */
    public Integer doDiv(int x, int y) {
        int quot = x / y;
        return quot;
    }

    /* method to find remainder/modulus */
    public Integer doMod(int x, int y) {
        int mod = x % y;
        return mod;
    }

    /* method to find power of result */
    public Integer doPow(int x, int y) {
        int prod = (int)Math.pow(x,y);
        return prod;
    }

}