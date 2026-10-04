package weeklyAssignment2;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int num = 153;
	        int originalNum = num;
	        int sum = 0;

	        while (num > 0) {

	            int lastDigit = num % 10;
	            sum = sum + lastDigit * lastDigit * lastDigit;
	            num = num / 10;
	        }

	        if (sum == originalNum) {
	            System.out.println("153 is an Armstrong number");
	        }
	}
	}

