package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = new int[3];
		sort(myArray);

	}

	/////////////////////////////////////////////////////////

	public static void sort(int[] Array) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter " + Array.length + " elements");

		for (int i = 0; i < Array.length; i++) {
			Array[i] = scanner.nextInt();
		}

		for (int i = 0; i < Array.length; i++) {
			System.out.println("Element " + i + " was " + Array[i]);
		}

		// Using sort metod :
		// Arrays.sort(Array);

		

			for (int i = 0; i < Array.length - 1; i++) {
				for(int j=i+1 ; j<Array.length ; j++)
				if (Array[i] > Array[j]) {
					int temp = Array[i];
					Array[i] = Array[j];
					Array[j] = temp;
				}
			}
		

		for (int i = 0; i < Array.length; i++) {
			System.out.println(Array[i]);
		}
	}

	///////////////////////////////////////////////////////////////////

}
