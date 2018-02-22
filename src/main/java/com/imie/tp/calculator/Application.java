package com.imie.tp.calculator;

import com.imie.tp.calculator.operation.AdditionOperation;
import com.imie.tp.calculator.operation.DivisionOperation;
import com.imie.tp.calculator.operation.MultiplicationOperation;
import com.imie.tp.calculator.operation.SubtractionOperation;
import com.imie.tp.calculator.utils.HistoryManager;
import com.imie.tp.calculator.utils.KeyboardUtils;

/**
 * Main application.
 */
public final class Application {

    /**
     * Default constructor.
     */
    private Application() {
        // cannot be called from children
    }

    /**
     * Main application.
     * @param args application parameters
     */
    public static void main(final String[] args) {

        final HistoryManager historyManager = new HistoryManager();
        int input; // store input from keyboard

        String operation = null;

        do {
            input = Integer.parseInt(KeyboardUtils.readFromKeyboard("Type of Operation: "));
            switch (input) {
            case 1:
                operation = handleAddition(promptOperand("a"), promptOperand("b"));
                break;
            case 2:
                operation = handleSubtraction(promptOperand("a"), promptOperand("b"));
                break;
            case 3:
                operation = handleDivision(promptOperand("a"), promptOperand("b"));
                break;
            case 4:
                operation = handleMultiplication(promptOperand("a"), promptOperand("b"));
                break;
            case 5:
                historyManager.showHistory();
                break;
            default:
                System.out.println("Wrong item: enter 1 to 5 for operation, or 9 to exit");
                break;
            }
            if (operation != null) {
                System.out.println(operation);
                historyManager.addOperation(operation);
                operation = null;
            }
        } while (input != 9);
    }

    /**
     * Create, perform and return the performed Addition.
     * @param operandA first operand
     * @param operandB second operand
     * @return string representation of the performed operation
     */
    public static String handleAddition(final float operandA, final float operandB) {

        final AdditionOperation addition = new AdditionOperation(operandA);

        return operandA + " + " + operandB + " = " + addition.make(operandB);
    }

    /**
     * Create, perform and return the performed Subtraction.
     * @param operandA first operand
     * @param operandB second operand
     * @return string representation of the performed operation
     */
    public static String handleSubtraction(final float operandA, final float operandB) {

        final SubtractionOperation sub = new SubtractionOperation(operandA);

        return operandA + " - " + operandB + " = " + sub.make(operandB);
    }

    /**
     * Create, perform and return the performed Multiplication.
     * @param operandA first operand
     * @param operandB second operand
     * @return string representation of the performed operation
     */
    public static String handleMultiplication(final float operandA, final float operandB) {

        final MultiplicationOperation multiplication = new MultiplicationOperation(operandA);

        return operandA + " x " + operandB + " = " + multiplication.make(operandB);
    }

    /**
     * Create, perform and return the performed Division.
     * @param operandA first operand
     * @param operandB second operand
     * @return string representation of the performed operation
     */
    public static String handleDivision(final float operandA, final float operandB) {

        final DivisionOperation multiplication = new DivisionOperation(operandA);

        return operandA + " / " + operandB + " = " + multiplication.make(operandB);
    }

    /**
     * Prompt for an operand input.
     * @param member operand
     * @return parsed input
     */
    private static float promptOperand(final String member) {
        return Float.parseFloat(KeyboardUtils.readFromKeyboard("Enter Value " + member + ": "));
    }
}
