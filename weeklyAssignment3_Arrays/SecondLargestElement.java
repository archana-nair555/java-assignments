package weeklyAssignment3_Arrays;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers= {12, 45, 7, 89, 34, 89, 56};
		int large=0;
		int secondLargest=0;
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i] > large) {
				large=numbers[i];
			}
		}

		for (int i=0; i<numbers.length; i++) {
			if (numbers[i]>secondLargest && numbers[i] != large) {
				secondLargest=numbers[i];
			}
		}
		
		System.out.println("Second largest element: " +secondLargest);
	}

}
