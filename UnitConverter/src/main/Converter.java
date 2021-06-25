package main;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Metric Conversion!\nWhat is your first name?");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		System.out.println("Hello " + name);
		
		boolean anotherConversion = true;
		
		while(anotherConversion) {
		System.out.println("Do you want to make a conversion?\n\nIf so, answer yes.");
		String answer = input.next();
		
		if (answer.equals("yes")) {
		String menuSelection = "1. Kilometers(km) to Meters(m)\n2. Meters(m) to Centimeters(cm)\n3. Centimeters(cm) to Millimeters(mm)";
		System.out.println("\nPlease select an option:\n" + menuSelection);
		
		int userSelection = input.nextInt();
		
		switch(userSelection) {
			case ( 1): {
				System.out.println("How many km are you converting to m?");
				int km = input.nextInt();
				int kiloToMeters = km * 1000;
				System.out.println("That's an easy one! " + km + "km is equal to " + kiloToMeters + "m");
				System.out.println("");
				}
			break;
			case ( 2): {
				System.out.println("How many m are you converting to cm?");
				int m = input.nextInt();
				int metersToCentimeters = m * 100;
				System.out.println("Good one! " + m + "m is equal to " + metersToCentimeters + "cm");
				System.out.println("");
				}
			break;
			case ( 3) :{
				System.out.println("How many cm are you converting to mm?");
				int cm = input.nextInt();
				int centimetersToMillimeters = cm * 10;
				System.out.println("Piece of cake" + cm + "cm is equal to " + centimetersToMillimeters + "mm");
				System.out.println("");
				}
			break;
			default: {
				System.out.println("You did not make a valid selection...\nPlease try again: ");
				System.out.println("");
				}
		}
		}
		else if (answer.equals("no")) {
			anotherConversion = false;
		
		System.out.println("See ya next time!");
		}
		}
		}
	}
		


