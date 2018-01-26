package com.imie.tp.calculator.operation;

public abstract class OperationCommandBase implements OperationCommand {

    private float currentValue;

    public OperationCommandBase(float baseValue)
    {
        this.currentValue = baseValue;
    }

    public float getCurrentValue() {
        return this.currentValue;
    }
}
