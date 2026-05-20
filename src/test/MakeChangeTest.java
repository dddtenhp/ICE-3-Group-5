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

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import main.BadChangeException;
import main.MakeChange;

public class MakeChangeTest {
	
	 // @Disabled("Already tested by previous teammate")
	 @Test
	    void testMakeChange40Cents() throws BadChangeException {

	        assertEquals(
	                "40 cents requires 1 quarter, 1 dime, 1 nickel",
	                MakeChange.makeChange(40)
	        );
	 }
	 
	 @Test
	 void testMakeChange19Cents() throws BadChangeException {
	     assertEquals(
	             "19 cents requires 2 dimes",
	             MakeChange.makeChange(19)
	     );
	 }

	 @Test
	 void testMakeChange92Cents() throws BadChangeException {
	     assertEquals(
	             "92 cents requires 3 quarters, 1 dime, 1 nickel",
	             MakeChange.makeChange(92)
	     );
	 }
	 
}
