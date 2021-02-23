/*
 * Fei Wei
 * Student# 991625792
 * 
 */
package week1.sheridancollege.ca;

import java.util.Scanner;

/**
 *
 * @author moi
 */
public class ReverseWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");

        String temp = input.nextLine();

        //Copying each character to array
        char[] word = new char[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            word[i] = temp.charAt(i);
        }

        //Print out each character
        System.out.println("The entered string is: ");
        for (char k : word) {
            System.out.println(k);
        }

        System.out.println("\nThe reverse string is");
        for (int j = word.length - 1; j >= 0; j--) {
            System.out.println(word[j]);
        }

    }

}
