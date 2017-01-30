package com.example.magna2.junittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by MAGNA2 on 30/01/2017.
 */

public class SimpleMathTest {



    SimpleMath sm;

    @Rule
    public ReportTextExecution exec = new ReportTextExecution();


    @Before
    public void setup() {
        sm = new SimpleMath();
//        // sysout to simulate call to Web service
//        System.out.println("Sending to Web service:  about to execute test method in SimpleMathTest.");
    }

//    @After
//    public void tearDown() {
//        // sysout to simulate call to Web service
//        System.out.println("Sending to Web service:  done executing test method in SimpleMathTest.");
//    }



    @Test
    public void testAdd() {
        assertEquals("SimpleMath addition not adding correctly", 9, sm.add(4, 5));
    }

    @Test
    public void testDiff() {
        assertEquals("SimpleMath diff not subtracting correctly", 5, sm.diff(12, 7));
    }

}
