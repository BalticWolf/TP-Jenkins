package com.imie.tp.calculator.operation;

/**
 * Division class.
 */
public class DivisionOperation extends OperationCommandBase {

    /**
     * @param operand first operand
     */
    public DivisionOperation(final float operand) {
        super(operand);
    }

    /**
     * @param value is the second operand
     * @return current divided by second operands, if not equal to zero
     */
    @Override
    public float make(final float value) {
        float result;
        if (value == 0) {
            result = Integer.MAX_VALUE;
        } else {
            result = this.getCurrentValue() / value;
        }
        return result;
    }

    /**
     * @return the base operand
     */
    @Override
    public float getCurrentValue() {
        return super.getCurrentValue();
    }
}
