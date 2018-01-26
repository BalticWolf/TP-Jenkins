package com.imie.tp.calculator.operation;

public abstract class OperationCommandBase implements OperationCommand {

    public OperationCommandBase(float baseValue)
    {
        this.currentValue = baseValue;
    }

    private float currentValue;
}
