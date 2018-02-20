package com.imie.tp.calculator.operation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubtractionOperationTest {

    private SubtractionOperation subtraction;

    @Before
    public void setUp() throws Exception {
        this.subtraction = new SubtractionOperation(42);
    }

    @After
    public void tearDown() throws Exception {
        this.subtraction = null;
    }

    @Test
    public void make() {
        assertNotNull(this.subtraction);
        assertEquals(37, this.subtraction.make(5), 0);
        assertEquals(47, this.subtraction.make(-5), 0);
        assertEquals(41.5F, this.subtraction.make(0.5F), 0);
    }

    @Test
    public void getCurrentValue() {
        assertNotNull(this.subtraction);
        assertEquals(42, this.subtraction.getCurrentValue(), 0);
    }
}