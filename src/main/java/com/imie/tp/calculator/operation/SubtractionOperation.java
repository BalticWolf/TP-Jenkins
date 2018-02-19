package com.imie.tp.calculator.operation;

/**
 * Subtraction class.
 */
public class SubtractionOperation extends OperationCommandBase {

    /**
     * @param operand first operand
     */
    public SubtractionOperation(final float operand) {
        super(operand);
    }

    /**
     * @param value is the second operand
     * @return subtraction of second operand from current
     */
    @Override
    public float make(final float value) {
        return this.getCurrentValue() - value;
    }

    /**
     * @return the base operand
     */
    @Override
    public float getCurrentValue() {
        return SubtractionOperation.super.getCurrentValue();
    }
}
