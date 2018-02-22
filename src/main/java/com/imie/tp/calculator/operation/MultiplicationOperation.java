package com.imie.tp.calculator.operation;

/**
 * Multiplication class.
 */
public class MultiplicationOperation extends OperationCommandBase {

    /**
     * @param operand first operand
     */
    public MultiplicationOperation(final float operand) {
        super(operand);
    }

    /**
     * @param value is the second operand
     * @return multiplication of current and second operands
     */
    @Override
    public float make(final float value) {
        return this.getCurrentValue() * value;
    }

    /**
     * @return the base operand
     */
    @Override
    public float getCurrentValue() {
        return super.getCurrentValue();
    }
}
