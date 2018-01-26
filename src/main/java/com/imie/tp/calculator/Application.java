package com.imie.tp.calculator;

import com.imie.tp.calculator.operation.AdditionOperation;
import com.imie.tp.calculator.utils.HistoryManager;
import com.imie.tp.calculator.utils.KeyboardUtils;

public class Application {

    public static void main(String[] args) {

        // Process...
        // Display & Ask "Type of Operation ":
        //               - 1 : Addition
        //               - 2 : Subtraction
        //               - 3 : Divide
        //               - 4 : Multiplication
        //               - 5 : Display History
        //               - 9 : Quit

        // If enter 1
        // Display & Ask "Enter Value a : "
        // Display & Ask "Enter Value b : "
        // after
        // Display : result

        // If enter 5
        // Display last calculate :
        //    1 + 1 = 2
        //    2 * 3 = 6

        // If enter 9 => Quit application

        //TODO
        HistoryManager historyManager = new HistoryManager();
        String operation;
        int input;
        float operandA;
        float operandB;
        float result;
        do {
            input = Integer.parseInt(KeyboardUtils.readFromKeyboard("Type of Operation: "));
            switch (input) {
                case 1:
                    operandA = Float.parseFloat(KeyboardUtils.readFromKeyboard("Enter Value a: "));
                    AdditionOperation addition = new AdditionOperation(operandA);

                    operandB = Float.parseFloat(KeyboardUtils.readFromKeyboard("Enter Value b: "));
                    result = addition.make(operandB);

                    operation = operandA + " + " + operandB + " = " + result;
                    System.out.println(operation);
                    historyManager.addOperation(operation);
                    break;
//                case 2:
//                    // TODO
//                    break;
                case 5:
                    historyManager.showHistory();
                    break;
                default:
                    System.out.println("default");
                    break;
            }
        } while (input != 9);
    }
}
