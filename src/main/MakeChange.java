/*
 Name: Caleb Bettencourt, Joann Monteiro, Masaki Takenaka, 
 Sama Aledan, Tan Pham, Valmir Muratovski

Student ID: 991726993, 991741787, 991727296
Assignment: ICE3

This class calculates change using quarters, dimes, and nickels.
*/
package main;

public class MakeChange {
	public static String makeChange(int cents) throws BadChangeException {
		
		int original = cents;
		int quarters = cents / 25;
		cents %= 25;
		int dimes = cents / 10;
		cents %= 10;
		int nickels = cents / 5;
        return String.format("%d cents requires %d quarter, %d dime, %d nickel",
                original,
                quarters,
                dimes,
                nickels);
    }
}
