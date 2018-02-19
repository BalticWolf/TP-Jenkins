package com.imie.tp.calculator.operation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationOperationTest {

    private MultiplicationOperation multiplication;

    @Before
    public void setUp() throws Exception {
        this.multiplication = new MultiplicationOperation(42);
    }

    @After
    public void tearDown() throws Exception {
        this.multiplication = null;
    }

    @Test
    public void make() {
        assertNotNull(this.multiplication);
        assertEquals(84, this.multiplication.make(2), 0);
        assertEquals(-84, this.multiplication.make(-2), 0);
        assertEquals(0, this.multiplication.make(0), 0);
    }

    @Test
    public void getCurrentValue() {
        assertNotNull(this.multiplication);
        assertEquals(42, this.multiplication.getCurrentValue(), 0);
    }
}