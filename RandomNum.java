package practicalOne;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNum {

	public static void main(String[] args) {

		// Practical 1: Generate 500 random numbers and print the nth smallest number in
//programming language of your choice. (Ask user for the Nth smallest number)

		 try (Scanner input = new Scanner(System.in)) {
			Random rand = new Random();
			int[] array = new int[500]; 
			for (int i = 0; i <  500; i++) {
				array[i] = rand.nextInt(99999);    
			}
			
			Arrays.sort(array);
		String randumnumber=Arrays.toString(array);
		//convert Array into String and store it in a variable
		
			System.out.println(randumnumber);
			System.out.println("Random number count: " + array.length );
			System.out.print("Enter the value of n to find the nth smallest number: ");
			int n = input.nextInt();
			System.out.println("The " + n + "th smallest number is: " + array[n - 1]);
		}
		 
		
		}
	
	
	}

