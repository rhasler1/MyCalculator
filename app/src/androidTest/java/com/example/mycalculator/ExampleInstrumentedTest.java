package com.example.mycalculator;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
// TODO: use mockito here



    /*
    protected CalculatorAdapter model2;

    * model2.x = 5; model2.y = 0;
        model2.doDiv(v);
        assertEquals(model2.t1.toString(), "Please enter required numbers");
    *
    * */

@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.mycalculator", appContext.getPackageName());
    }
}