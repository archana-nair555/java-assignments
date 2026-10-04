package weeklyAssignment2;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 12345;

		while (num > 0) {
		    
		    int lastDigit = num % 10;
		    System.out.print(lastDigit);
		    num = num / 10;
		}

	}

}
