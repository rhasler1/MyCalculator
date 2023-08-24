package com.example.mycalculator;


public interface Calculator<Result> {

    Result doSum(int x, int y);
    Result doSub(int x, int y);
    Result doMul(int x, int y);
    Result doDiv(int x, int y);
    Result doMod(int x, int y);
    Result doPow(int x, int y);

}
