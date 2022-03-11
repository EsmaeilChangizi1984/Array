package Arrays;
import java.util.Scanner;


public class Minimum_Array {
	
	
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//myArray(3);
		findMin(myArray(3));
	

	}
	
	//////////////////////////////////////////////////////////////////
	
	public static int[]myArray(int count){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of elements.");
		count = scanner.nextInt();
		
	    int[]Array = new int[count];
		
		for(int i=0 ; i<count ; i++) {
			System.out.println("Enter number "+i);
			Array[i]=scanner.nextInt();
		}
		
		return Array;
	}
	
	/////////////////////////////////////////////////////////////////////
	
	
	public static int findMin(int[]Array) {
		int min = Array[0];
		
		for(int i=0 ; i<Array.length ; i++) {
			if(Array[i]<min) 
				min = Array[i];
		}
		System.out.println("The minimum number is "+min);
		return min;
	}
	
	

}
