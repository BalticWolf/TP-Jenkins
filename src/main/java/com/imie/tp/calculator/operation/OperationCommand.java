package com.imie.tp.calculator.operation;

/**
 * Main operation interface.
 */
public interface OperationCommand {

    /**
     * @param value second operand
     */
    float make(float value);

    /**
     * @return first operand
     */
    float getCurrentValue();
}
