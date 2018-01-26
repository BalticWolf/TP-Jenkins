package com.imie.tp.calculator;

import com.imie.tp.calculator.operation.AdditionOperation;
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
        // cannot be call from children
    }

    /**
     * Main application.
     * @param args application parameters
     */
    public static void main(final String[] args) {

        final HistoryManager historyManager = new HistoryManager();
        String operation; // string representation of an operation
        int input; // store input from keyboard
        float operandA;
        float operandB;
        float result;
        do {
            input = Integer.parseInt(KeyboardUtils.readFromKeyboard("Type of Operation: "));
            switch (input) {
            case 1:
                operandA = Float.parseFloat(KeyboardUtils.readFromKeyboard("Enter Value a: "));
                final AdditionOperation addition = new AdditionOperation(operandA);

                operandB = Float.parseFloat(KeyboardUtils.readFromKeyboard("Enter Value b: "));
                result = addition.make(operandB);

                operation = operandA + " + " + operandB + " = " + result;
                System.out.println(operation);
                historyManager.addOperation(operation);
                break;
            case 2:
                System.out.println("subtraction");
                break;
            case 3:
                System.out.println("division");
                break;
            case 4:
                System.out.println("multiplication");
                break;
            case 5:
                historyManager.showHistory();
                break;
            default:
                System.out.println("Wrong item: enter 1 to 5 for operation, or 9 to exit");
                break;
            }
        } while (input != 9);
    }
}
