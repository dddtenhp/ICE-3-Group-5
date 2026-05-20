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
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MakeChangeTest {
	
	 @Disabled
	 @Test
	    void testMakeChange40Cents() throws BadChangeException {

	        assertEquals(
	                "40 cents requires 1 quarter, 1 dime, 1 nickel",
	                MakeChange.makeChange(40)
	        );
	 }
	 
	 @Disabled
	 @Test
	 void testMakeChange19Cents() throws BadChangeException {
	     assertEquals(
	             "19 cents requires 2 dimes",
	             MakeChange.makeChange(19)
	     );
	 }
	 
	 @Disabled
	 @Test
	 void testMakeChange92Cents() throws BadChangeException {
	     assertEquals(
	             "92 cents requires 3 quarters, 1 dime, 1 nickel",
	             MakeChange.makeChange(92)
	     );
	 }
	 
	 // Rounds up or down
	 @Test
	 void testMakeChange2CentsCannotCalculate() throws BadChangeException {
	     assertEquals(
	             "Cannot calculate change.",
	             MakeChange.makeChange(2)
	     );
	 }

	 @Test
	 void testMakeChange99CentsCannotCalculate() throws BadChangeException {
	     assertEquals(
	             "Cannot calculate change.",
	             MakeChange.makeChange(99)
	     );
	 }
	 
	 // Throws Bad Change Exception
	 @Test
	 void testMakeChangeNegativeCentsThrowsException() {
	     assertThrows(
	             BadChangeException.class,
	             () -> MakeChange.makeChange(-1)
	     );
	 }

	 @Test
	 void testMakeChangeOver100CentsThrowsException() {
	     assertThrows(
	             BadChangeException.class,
	             () -> MakeChange.makeChange(101)
	     );
	 }
	 
}
