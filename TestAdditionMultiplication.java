/*Student  Ritu tinker.
 * project name : LabTestOnJunit.
 * 1.Write a program for addition() and multiplication() of two numbers.
Write test cases for each of these methods.*/
package LabTestJunit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestAdditionMultiplication {
	//Addition

     @Test
	public void AddTest() {
		
    	     	 assertEquals(44,AdditionMultiplication.Addition(19,25));
    	     	// assertEquals(48,AdditionMultiplication.Addition(19,25));
     }
     //Multiplication
    	 @Test
    		public void MulTest() {
    		
    	 assertEquals(475, AdditionMultiplication.Multiplication(19,25));
    	// assertEquals(495, AdditionMultiplication.Multiplication(19,25));
    
	}}