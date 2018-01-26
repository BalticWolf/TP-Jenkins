package com.imie.tp.calculator.utils;

import java.util.Scanner;

/**
 * Handle keyboard inputs.
 */
public final class KeyboardUtils {

    /**
     * Class constructor.
     */
    private KeyboardUtils() {
        // cannot be called from children
    }

    /**
     * @param displayAsk input given by user
     * @return representation of string input
     */
    public static String readFromKeyboard(final String displayAsk) {
        final Scanner keyboard = new Scanner(System.in);

        System.out.println(displayAsk);

        return keyboard.nextLine();
    }
}
