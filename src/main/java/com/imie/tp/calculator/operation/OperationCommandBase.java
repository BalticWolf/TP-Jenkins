package com.imie.tp.calculator.operation;

/**
 * Master class implementation.
 */
public abstract class OperationCommandBase implements OperationCommand {

    /**
     * Base operand, set for each class instance.
     */
    private float currentValue;

    /**
     * @param baseValue is the base operand
     */
    public OperationCommandBase(float baseValue) {
        this.currentValue = baseValue;
    }

    /**
     * @return the base operand
     */
    public float getCurrentValue() {
        return this.currentValue;
    }
}
