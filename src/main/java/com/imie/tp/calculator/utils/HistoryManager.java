package com.imie.tp.calculator.utils;

import java.util.*;

public class HistoryManager {
    private List<String> latestOperations;

    public HistoryManager() {
        this.latestOperations = new ArrayList<>();
    }

    public void addOperation(String operation) {
        this.latestOperations.add(operation);
    }

    public void showHistory() {
        this.latestOperations.forEach(operation -> System.out.println(operation));
    }

    public List<String> getLatestOperations() {
        return this.latestOperations;
    }
}
