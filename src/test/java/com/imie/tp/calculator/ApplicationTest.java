package com.imie.tp.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplicationTest {
    private float a;
    private float b;

    @Before
    public void setUp() throws Exception {
        this.a = 42F;
        this.b = 2F;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void handleAddition() {
        assertEquals("42.0 + 2.0 = 44.0", Application.handleAddition(this.a, this.b));
    }

    @Test
    public void handleSubtraction() {
        assertEquals("42.0 - 2.0 = 40.0", Application.handleSubtraction(this.a, this.b));
    }

    @Test
    public void handleMultiplication() {
        assertEquals("42.0 x 2.0 = 84.0", Application.handleMultiplication(this.a, this.b));
    }

    @Test
    public void handleDivision() {
        assertEquals("42.0 / 2.0 = 21.0", Application.handleDivision(this.a, this.b));
    }
}