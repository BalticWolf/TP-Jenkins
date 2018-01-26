package com.imie.tp.calculator.operation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AdditionOperationTest {

    private AdditionOperation addition;

    @org.junit.Before
    public void setUp() throws Exception {
        this.addition = new AdditionOperation(42);
    }

    @org.junit.After
    public void tearDown() throws Exception {
        this.addition = null;
    }

    @org.junit.Test
    public void make() {
        assertNotNull(this.addition);
        assertEquals(47, this.addition.make(5), 0);
        assertEquals(37, this.addition.make(-5), 0);
    }

    @org.junit.Test
    public void getCurrentValue() {
        assertNotNull(this.addition);
        assertEquals(42, this.addition.getCurrentValue(), 0);
    }
}