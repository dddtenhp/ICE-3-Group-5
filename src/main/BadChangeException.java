/*
 Name: Caleb Bettencourt, Joann Monteiro, Masaki Takenaka, 
 Sama Aledan, Tan Pham, Valmir Muratovski

Student ID: 991719766, 991726993, 991737452, 991741787, 991727296, 991732872
Assignment: ICE3

Custom exception for invalid change values
*/
package main;

public class BadChangeException extends Exception{
	
	public BadChangeException(String message) {
        super(message);
    }
	
}
