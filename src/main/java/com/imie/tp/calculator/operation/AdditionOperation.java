package com.imie.tp.calculator.operation;

public class AdditionOperation extends OperationCommandBase {

    public AdditionOperation(float operand) {
        super(operand);
    }

    @Override
    public float make(float value) {
        return this.getCurrentValue() + value;
    }

    @Override
    public float getCurrentValue() {
        return AdditionOperation.super.getCurrentValue();
    }
}
