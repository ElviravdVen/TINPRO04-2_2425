/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   22/11/2024          *                                                                                          *
 *******************************/

package AlphabeticalSequence;

/*
-	Een getal aan de gebruiker kan vragen
-	Het gegeven getal gebruikt om letters uit het alfabet op het scherm te printen in regels
Per regel komt er steeds 1 letter bij, totdat er net zoveel letters op de regel staan als het getal wat opgegeven is
Bij ‘5’, print je 5 rijen, bij ‘6’ 6, enz.
Voorbeeldoutput bij input ‘5’:
A
A B
A B C
A B C D
A B C D E

-	Bij input > 26 kom je na de ‘Z’ weer uit bij ‘A’ en ga je opnieuw het alfabet af.
-	Zorg dat het programma niet kan crashen!
 */
import java.util.Scanner;

public class AlphabeticalSequence {
    public static void main(String[] args) {
        String letters = "abcdefghijklmnopqrstuwvxyz";
        char[] letter = letters.toCharArray();
        Scanner scanner = new Scanner(System.in);
        int getal;
        System.out.println("Geef aub een getal");
        //Test of input kleiner is dan MAX_VALUE en groter dan 0.

        do {
            getal = scanner.nextInt();
        }
        while (getal > Integer.MAX_VALUE && getal < 0);

        for(int i = 0; i < getal; i++){
            System.out.println(letter[i]);
        }
    }
}