/*
* This program uses the MrCoxallStack class.
*
* @author  Donggeun Lim
* @version 1.0
* @since   2021-12-08
*/
// package ca.mths.unit2.unit01.java.stackForm;

import java.util.Scanner;

/**
* This class is StackForm.
*/
public final class StackForm {

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private StackForm() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This method gets some string input and shows reversed string.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final Scanner myObj = new Scanner(System.in);
        final MrCoxallStack aStack = new MrCoxallStack();

        while (true) {
            System.out.print("Enter the number to push on the stack: ");
            try {
                final int inputNumber = Integer.parseInt(myObj.nextLine());
                aStack.push(inputNumber);
            }
            catch (IOException | NumberFormatException exception) {
                break;
            }
        }
        System.out.println("\nThe Stack: ");
        aStack.showStack();

        System.out.println("\nDone.");
    }
}
