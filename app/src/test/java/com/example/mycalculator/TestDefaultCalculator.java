package com.example.mycalculator;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


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

    //TODO: sub, mul, div, mod, pow,
}

