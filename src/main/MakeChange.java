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
		int remainder = cents % 5;
		
		if (remainder == 1 || remainder == 2) cents -= remainder;
	    else if (remainder == 3 || remainder == 4) cents += (5 - remainder);
		
		int quarters = cents / 25;
		cents %= 25;
		
		int dimes = cents / 10;
		cents %= 10;
		
		int nickels = cents / 5;
		
		String result = "";
		if (quarters > 0) 
			result += quarters + " quarter" + (quarters > 1 ? "s" : "");
	    if (dimes > 0) 
	    	result += (result.isEmpty() ? "" : ", ") + dimes + " dime" + (dimes > 1 ? "s" : "");
	    if (nickels > 0) 
	    	result += (result.isEmpty() ? "" : ", ") + nickels + " nickel" + (nickels > 1 ? "s" : "");
	    
	    return original + " cents requires " + result;
    }
}
