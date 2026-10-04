package weeklyAssignment2;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 987654;
        int count = 0;

        while (num > 0) {
            num = num / 10;
            count++;
        }

        System.out.println("Number of digits = " + count);

	}

}
