package com.imie.tp.calculator;

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
        int input;
        do {
            input = Integer.parseInt(KeyboardUtils.readFromKeyboard("Type of Operation:"));
            switch (input) {
                case 1:
                    // TODO
                    System.out.println("Addition");
                    break;
//                case 2:
//                    // TODO
//                    break;
                default:
//                  // TODO
                    System.out.println("default");
                    break;
            }
        } while (input != 9);
    }
}
