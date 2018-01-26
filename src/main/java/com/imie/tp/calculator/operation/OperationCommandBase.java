package com.imie.tp.calculator.operation;

/**
 * Master class implementation.
 */
public abstract class OperationCommandBase implements OperationCommand {

    /**
     * Base operand, set for each class instance.
     */
    private final float currentValue;

    /**
     * @param baseValue is the base operand
     */
    public OperationCommandBase(final float baseValue) {
        this.currentValue = baseValue;
    }

    /**
     * @return the base operand
     */
    public float getCurrentValue() {
        return this.currentValue;
    }
}
