package Arrays;

import java.util.Scanner;

public class Main {
	
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		//int[] intArray = new int[10];
		
		int[] intArray = {1,2,3,4,5};
		
		
		//How to call array function
		printArray(intArray);
		
		
		//How to call array return function
		int[] myArray = Array(5);
		for (int i=0 ; i<5 ; i++) {
			System.out.println("Element "+i+" value was "+myArray[i]);
		}
		
		

	}
	
	
	
	
	
	
	//////////////////////////////////////////////////////////////
	public static void printArray(int[] Array) {
		for (int i=0 ; i<Array.length ; i++) {
			System.out.println("Element "+i+" value "+Array[i]);
		}
	}
	
	//////////////////////////////////////////////////////////////
	public static int[]Array(int number){
		System.out.println("Enter "+number+" values.\r");
		int[]myArray = new int[number];
		for(int i = 0; i<number ; i++) {
			myArray[i] = scanner.nextInt();
		}
		return myArray;
	}
	
      //////////////////////////////////////////////////////////////	

}
