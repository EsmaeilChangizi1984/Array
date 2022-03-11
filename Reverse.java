package Arrays;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Array = {3,4,5,6,7};
		reverseArray(Array,5);

	}

	public static void reverseArray(int[] Array,int num) {
		int[] myArray = new int[num];
		int temp;
		for (int i = 0; i < Array.length; i++) {
			myArray[num-1] = Array[i];
			num = num-1;
		}

		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i]);
		}

	}

}
