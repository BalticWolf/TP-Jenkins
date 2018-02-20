package com.imie.tp.calculator.operation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionOperationTest {

    private DivisionOperation division;

    @Before
    public void setUp() throws Exception {
        this.division = new DivisionOperation(42);
    }

    @After
    public void tearDown() throws Exception {
        this.division = null;
    }

    @Test
    public void make() {
        assertNotNull(this.division);
        assertEquals(21, this.division.make(2), 0);
        assertEquals(-21, this.division.make(-2), 0);
        assertEquals(84, this.division.make(0.5F), 0);
        assertEquals(Integer.MAX_VALUE, this.division.make(0), 0);
    }

    @Test
    public void getCurrentValue() {
        assertNotNull(this.division);
        assertEquals(42, this.division.getCurrentValue(), 0);
    }
}