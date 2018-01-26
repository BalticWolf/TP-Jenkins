package com.imie.tp.calculator.utils;

import java.util.List;
import java.util.ArrayList;

/**
 * Manages operations history.
 */
public class HistoryManager {

    /**
     * History container.
     */
    private final List<String> latestOperations;

    /**
     * HistoryManager constructor.
     */
    public HistoryManager() {
        this.latestOperations = new ArrayList<>();
    }

    /**
     * @param operation string representation to add to history
     */
    public void addOperation(final String operation) {
        this.latestOperations.add(operation);
    }

    /**
     * Display history (content of this.latestOperations).
     */
    public void showHistory() {
        this.latestOperations.forEach(operation -> System.out.println(operation));
    }

    /**
     * @return this.latestOperations
     */
    public List<String> getLatestOperations() {
        return this.latestOperations;
    }
}
