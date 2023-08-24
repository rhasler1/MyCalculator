package com.example.mycalculator;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import android.view.View;


public class TestDefaultCalculator {

    protected DefaultCalculator model;

    @Before
    public void setUp() throws Exception {
        model = new DefaultCalculator();
    }

    @After
    public void tearDown() { model = null; }


    @Test
    public void testAddition() {
        assertEquals(model.doSum(0,0).intValue(), 0);
        assertEquals(model.doSum(-1,1).intValue(), 0);
        assertEquals(model.doSum(-5,-5).intValue(), -10);
        assertEquals(model.doSum(5,5).intValue(), 10);
    }

    @Test
    public void testSubtraction() {
        assertEquals(model.doSub(0,0).intValue(), 0);
        assertEquals(model.doSub(-1,-1).intValue(), 0);
        assertEquals(model.doSub(-1,1).intValue(), -2);
        assertEquals(model.doSub(10,20).intValue(), -10);
        assertEquals(model.doSub(50,15).intValue(), 35);
    }

    @Test
    public void testMultiplication() {
        assertEquals(model.doMul(5,0).intValue(), 0);
        assertEquals(model.doMul(5,5).intValue(), 25);
        assertEquals(model.doMul(-5,5).intValue(), -25);
        assertEquals(model.doMul(-10,-10).intValue(), 100);
    }

    @Test
    public void testDivision() { // the case of 0 value denominator is taken care of by the adapter.
        assertEquals(model.doDiv(0,5).intValue(), 0);
        assertEquals(model.doDiv(10,2).intValue(), 5);
        assertEquals(model.doDiv(-5,5).intValue(), -1);
        assertEquals(model.doDiv(100,-10).intValue(), -10);
    }

    @Test
    public void testModulus() { // the case of 0 value denominator is taken care of by the adapter.
        assertEquals(model.doMod(5,4).intValue(), 1);
        assertEquals(model.doMod(10,5).intValue(), 0);
        assertEquals(model.doMod(-5,4).intValue(), -1); //TODO: look into why this is.
        assertEquals(model.doMod(5,-4).intValue(), 1); //TODO: look into why this is.
    }

    @Test
    public void testPower() {
        assertEquals(model.doPow(5,-1).intValue(), 0);
        assertEquals(model.doPow(10,0).intValue(), 1);
        assertEquals(model.doPow(0,0).intValue(), 1);
        assertEquals(model.doPow(5,2).intValue(), 25);
        assertEquals(model.doPow(2,5).intValue(), 32);
    }

}

