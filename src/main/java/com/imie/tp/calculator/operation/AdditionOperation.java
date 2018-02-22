package com.imie.tp.calculator.operation;

/**
 * Addition class.
 */
public class AdditionOperation extends OperationCommandBase {

    /**
     * @param operand first operand
     */
    public AdditionOperation(final float operand) {
        super(operand);
    }

    /**
     * @param value is the second operand
     * @return sum of current and second operands
     */
    @Override
    public float make(final float value) {
        return this.getCurrentValue() + value;
    }

    /**
     * @return the base operand
     */
    @Override
    public float getCurrentValue() {
        return super.getCurrentValue();
    }
}
