
import java.util.Arrays;

public class Looping {

	public static void main(String[] args) {
		
// Create a while loop that stores the numbers one through fifty in an array.

		//Array Initialization
		int [] halfDollar = new int [50];
		
		//Variables Initialization
		int counter = 1;
		int index = 0;		
		
		while (index < halfDollar.length) {
								
			//Storing array values in array
			halfDollar[index]= counter;
			index++;	
			counter++;
			}
		System.out.println(Arrays.toString(halfDollar));
		
		//Use a do while loop to add five to all the odd numbers in the array.
		
		index = 0;
		do {
			int currentElement = halfDollar[index];
			
			if(currentElement % 2 != 0) {
				
				halfDollar[index] = currentElement + 5;
			}
			index++;
		
		}while(index < halfDollar.length);
		
		System.out.println(Arrays.toString(halfDollar));
		
//Use a for loop to print each element of the array. Unless that element is a multiple of four or six. If it's a multiple of four print FOUR!!. If it's a multiple of six print SIX!!!. If it's a multiple of both print FOUR!!SIX!!!
	for (int i =0; i < halfDollar.length; i++) {
		
		int currentElement = halfDollar[i];
		
		if(currentElement % 4 == 0 && currentElement % 6 == 0)
			System.out.println("Multiple of FOUR!! and SIX!!");
		
		else if (currentElement % 4 == 0)
		System.out.println("Multiple of FOUR!");
		
		else if (currentElement % 6 == 0)
			System.out.println("Multiple of  SIX!");
		
		else
			System.out.println(currentElement);
	}
	
	}
}
