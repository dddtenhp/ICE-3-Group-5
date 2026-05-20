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
		
		if (cents < 0 || cents > 100) {
		    throw new BadChangeException("Invalid change amount.");
		}
		
		int original = cents;
		int remainder = cents % 5;
		
		if (remainder == 1 || remainder == 2) cents -= remainder;
	    else if (remainder == 3 || remainder == 4) cents += (5 - remainder);
		
		if (cents == 0 || cents == 100) {
		    return "Cannot calculate change.";
		}
		
		int quarters = cents / 25;
		cents %= 25;
		
		int dimes = cents / 10;
		cents %= 10;
		
		int nickels = cents / 5;
		
		String result = "";
		
// 		BEFORE REFACTOR:
//		Each coin type (quarters, dimes, nickels) used repeated formatting logic.
		
//		if (quarters > 0) 
//			result += quarters + " quarter" + (quarters > 1 ? "s" : "");
//	    if (dimes > 0) 
//	    	result += (result.isEmpty() ? "" : ", ") + dimes + " dime" + (dimes > 1 ? "s" : "");
//	    if (nickels > 0) 
//	    	result += (result.isEmpty() ? "" : ", ") + nickels + " nickel" + (nickels > 1 ? "s" : "");

		result = addCoin(result, quarters, "quarter");
		result = addCoin(result, dimes, "dime");
		result = addCoin(result, nickels, "nickel");
		
	    return original + " cents requires " + result;
    }
	
//	AFTER REFACTOR:
//		A reusable helper method called addCoin() was created to reduce duplicated code.
//
//		This improves readability and maintainability because formatting logic
//		is handled in one place instead of repeated multiple times.
	private static String addCoin(String result, int count, String coinName) {

	    if (count == 0) {
	        return result;
	    }

	    if (!result.isEmpty()) {
	        result += ", ";
	    }

	    result += count + " " + coinName;

	    if (count > 1) {
	        result += "s";
	    }

	    return result;
	}
}
