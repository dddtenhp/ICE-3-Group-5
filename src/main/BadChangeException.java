/*
 Name: Caleb Bettencourt, Joann Monteiro, Masaki Takenaka, 
 Sama Aledan, Tan Pham, Valmir Muratovski

Student ID: 991726993, 991741787, 991727296
Assignment: ICE3

Custom exception for invalid change values
*/
package main;

public class BadChangeException extends Exception{
	
	public BadChangeException(String message) {
        super(message);
    }
	
}
