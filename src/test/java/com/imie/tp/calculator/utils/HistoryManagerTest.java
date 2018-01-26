package com.imie.tp.calculator.utils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HistoryManagerTest {
    private HistoryManager historyManager;

    @Before
    public void setUp() throws Exception {
        this.historyManager = new HistoryManager();
    }

    @After
    public void tearDown() throws Exception {
        this.historyManager = null;
    }

    @Test
    public void addOperation() {
        this.historyManager.addOperation("0 + 0 = 0");
        this.historyManager.addOperation("1 + 2 = 3");
        assertEquals(2, this.historyManager.getLatestOperations().size());
    }
}