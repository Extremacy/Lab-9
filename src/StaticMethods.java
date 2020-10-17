/*
* PJ Duimstra
* October 16, 2020
* CSE 174
* Lab 9.2
 */

import java.util.Scanner;

public class StaticMethods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean end = false;
        String str = "";
        int sh = 0;
        do {
            System.out.print("1. Test addPound method.\n"
                    + "2. Test swapChars method.\n3. Test shift method.\n"
                    + "4. exit.\nEnter a number [1-4]: ");
            int option = in.nextInt();
            if (option >= 1 && option <= 3) {
                System.out.print("Enter a string: ");
                str = in.next();
                if (option == 3) {
                    System.out.print("Enter the shift value: ");
                    sh = in.nextInt();
                }
            }
            switch (option) {
                case 1: System.out.println(addPound(str));
                    break;
                case 2: System.out.println(swapChars(str));
                    break;
                case 3: System.out.println(shift(str, sh));
                    break;
                case 4: end = true;
                    break;
                default: System.out.println("\nInvalid Input");
            }
        } while (!end);
    }

    /*
    * Adds pounds between every character in a given string
    *
    * @param str the given string to be modified
    * @return the modified string
     */
    public static String addPound(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = result + str.charAt(i) + "#";
        }
        return result;
    }

    /*
    * Swaps characters that are alphabetical with their ASCII values
    *
    * @param str the String to be swapped
    * @return the swapped string
     */
    public static String swapChars(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                result = result + (int) str.charAt(i);
            } else {
                result = result + str.charAt(i);
            }
        }
        return result;
    }
    
    /*
    * Shifts a string of letters by a given factor.
    *
    * @param str, The given string to be shifted
    * @param num, The given factor to shift the string by.
    * @return the shifted string.
     */
    public static String shift(String str, int num) {
        String result = "";
        int newChar;
        for (int i = 0; i < str.length(); i++) {
            newChar = (int) str.charAt(i) + num;
            if (newChar > 90) {
                newChar -= 26;
            }
            result = result + (char) newChar;
        }
        return result;
    }
}
