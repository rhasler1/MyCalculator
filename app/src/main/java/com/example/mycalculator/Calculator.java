package com.example.mycalculator;


public interface Calculator<Result> {

    Result doSum(double x, double y);
    Result doSub(double x, double y);
    Result doMul(double x, double y);
    Result doDiv(double x, double y);
    Result doMod(double x, double y);
    Result doPow(double x, double y);

}
