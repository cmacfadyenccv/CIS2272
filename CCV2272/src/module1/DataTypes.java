/**
 * Review of data types from an introductory course in Java, e.g. CCV CIS2271
 * Introduction to some new types
 * 
 * @author C MacFadyen
 */

package module1;

import java.awt.Rectangle;
import java.util.Random;
import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {

		//primtiveTypes();
		//referenceTypes();
		//convertTypes();
		operations();


	}

	/**
	 * Demonstrates primitive types in Java
	 */

	private static void primtiveTypes() {
		boolean isOpen = false;

		char firstInitial = 'c'; //note the single quotes

		//Integer types
		int age = 34;
		long longAge = 236475537575L;  //note the l (or L) at the end
		short shortAge = 34;
		byte byteAge = 127;
		long anotherLong = age;


		//Floating-point types (have a decimal point)
		double speed = 45.8;
		float floatSpeed = 58.4f; //note the f (or F) for float

		System.out.println();

	}

	/**
	 * Demonstrates reference types in Java
	 * Reference types are objects built from classes
	 */
	private static void ReferenceTypes() {

		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		Rectangle rect = new Rectangle();

		String s = new String("Strings are sequences of characters");
		String easyWay = "This is a shortcut notation for the line above";

		//CCVstudent student = new CCVstudent(); 	//we would need to write a class here
	}



	private static void convertTypes() {
		int x = 87;
		double y = 54.7;
		char z = '9'; //the character 9

		x = z;
		
		System.out.println(x);
	}
	
	private static void operations() {
		//arithmetic
		
		
		//String concatenation
		
		
		
	}
}
