package com.example.mycalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalculatorAdapter extends AppCompatActivity {
    /*
    * include onClick methods
    * as well as getNumbers
    *
    * */

    private MainActivity model;

    protected void setModel(final MainActivity model) { this.model = model; }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setModel(new MainActivity());
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

    protected int getX() { return this.x; }
    protected int getY() { return this.y; }

    public void doSum(View v) {
        if (getNumbers()) {
            int result = this.model.doSum(getX(), getY());
            t1.setText(Integer.toString(result));
        } else {
            String result = "Please enter required numbers";
            t1.setText(result);
        }
    }

    public void doSub(View v) {
        if (getNumbers()) {
            int result = this.model.doSub(getX(), getY());
            t1.setText(Integer.toString(result));

        } else {
            String result = "Please enter required numbers";
            t1.setText(result);

        }
    }

    public void doMul(View v) {
        if (getNumbers()) {
            int result = this.model.doMul(getX(), getY());
            t1.setText(Integer.toString(result));

        } else {
            String result = "Please enter required numbers";
            t1.setText(result);

        }
    }

    public void doDiv(View v) {
        if (getNumbers() && y != 0) {
            int result = this.model.doDiv(getX(), getY());
            t1.setText(Integer.toString(result));

        } else {
            String result = "Please enter required numbers";
            t1.setText(result);

        }
    }

    public void doMod(View v) {
        if (getNumbers() && y != 0) {
            int result = this.model.doMod(getX(), getY());
            t1.setText(Integer.toString(result));

        } else {
            String result = "Please enter required numbers";
            t1.setText(result);

        }
    }

    public void doPow(View v) {
        if (getNumbers()) {
            int result = this.model.doPow(getX(), getY());
            t1.setText(Integer.toString(result));

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
