package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected EditText e1;
    protected EditText e2;
    protected TextView t1;
    protected int x;
    protected int y;

    public boolean getNumbers() {

        e1 = (EditText)findViewById(R.id.num1);// num1 is the id for the textbox and I am...
        e2 = (EditText)findViewById(R.id.num2);// ...providing e1 as a variable name to the textbox

        t1 = (TextView)findViewById(R.id.result);// TextView variable only used to display text

        String s1 = e1.getText().toString(); // Strings used to store numbers entered in textbox 1 and 2
        String s2 = e2.getText().toString();


        if (s1.length() <= 0 && s2.length() >= 1) { // case when no input value for num1
            String result = "Please enter value one";
            e1.setText(result);
            return false;

        } else if (s1.length() >= 1 && s2.length() <= 0) { // case when no input value for num2
            String result = "Please enter value two";
            e2.setText(result);
            return false;

        } else if (s1.length() <= 0 && s2.length() <= 0) { // case when no input value for num1 and num2
            String result1 = "Please enter value one";
            String result2 = "Please enter value two";
            e1.setText(result1);
            e2.setText(result2);
            return false;

        } else if (s1.equals(null) && s2.equals(null) || s1.equals(null) && s2.equals(null)) { // case when null
            return false;
        }

        x = Integer.valueOf(s1);
        y = Integer.valueOf(s2);
        return true;
    }

    /* method to add */
    public void doSum(View v) {
        if (getNumbers()) {
            int sum = x + y;
            t1.setText(Integer.toString(sum));

        } else {
            String result = "Please enter required numbers";
            t1.setText(result);
        }
    }

    /* method to subtract */
    public void doSub(View v) {
        if (getNumbers()) {
            int dif = x - y;
            t1.setText(Integer.toString(dif));

        } else {
            String result = "Please enter required numbers";
            t1.setText(result);

        }
    }

    /* method to multiply */
    public void doMul(View v) {
        if (getNumbers()) {
            int prod = x * y;
            t1.setText(Integer.toString(prod));

        } else {
            String result = "Please enter required numbers";
            t1.setText(result);

        }
    }

    /* method to divide */
    public void doDiv(View v) {
        if (getNumbers() && y != 0) {
            int quot = x / y;
            t1.setText(Integer.toString(quot));

        } else {
            String result = "Please enter required numbers";
            t1.setText(result);

        }
    }

    /* method to find remainder/modulus */
    public void doMod(View v) {
        if (getNumbers() && y != 0) {
            int mod = x % y;
            t1.setText(Integer.toString(mod));

        } else {
            String result = "Please enter required numbers";
            t1.setText(result);
        }
    }

    /* method to find power of */
    public void doPow(View v) {
        if (getNumbers()) {
            int prod = (int)Math.pow(x,y);
            t1.setText(Integer.toString(prod));

        } else {
            String result = "Please enter required numbers";
            t1.setText(result);

        }
    }

    /* method to clear num1 */
    public void clearTextNum1(View v){
        e1.getText().clear();
    }

    /* method to clear num2 */
    public void clearTextNum2(View v) {
        e2.getText().clear();
    }

}