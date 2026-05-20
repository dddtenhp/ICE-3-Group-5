/*
 Name: Caleb Bettencourt, Joann Monteiro, Masaki Takenaka, 
 Sama Aledan, Tan Pham, Valmir Muratovski

Student ID: 991726993, 991741787, 991727296
Assignment: ICE3

This test suite validates the makeChange method
using TDD and JUnit.

*/
package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import main.BadChangeException;
import main.MakeChange;

public class MakeChangeTest {
	
	 @Test
	    void testMakeChange40Cents() throws BadChangeException {

	        assertEquals(
	                "40 cents requires 1 quarter, 1 dime, 1 nickel",
	                MakeChange.makeChange(40)
	        );
	    }
}
