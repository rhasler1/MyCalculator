package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity {

    /* method to add */
    public int doSum(int x, int y) {
        int sum = x + y;
        return sum;
    }

    /* method to subtract */
    public int doSub(int x, int y) {
        int dif = x - y;
        return dif;
    }

    /* method to multiply */
    public int doMul(int x, int y) {
        int prod = x * y;
        return prod;
    }

    /* method to divide */
    public int doDiv(int x, int y) {
        int quot = x / y;
        return quot;
    }

    /* method to find remainder/modulus */
    public int doMod(int x, int y) {
        int mod = x % y;
        return mod;
    }

    /* method to find power of */
    public int doPow(int x, int y) {
        int prod = (int)Math.pow(x,y);
        return prod;
    }

}