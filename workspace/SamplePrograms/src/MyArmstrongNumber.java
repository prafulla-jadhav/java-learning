
public class MyArmstrongNumber {

	public static void main(String[] args) {
		MyArmstrongNumber myArmstrongNumber = new MyArmstrongNumber();
		System.out.println(myArmstrongNumber.isArmStrongNumber(153));
	}

	private boolean isArmStrongNumber(int number) {
		int div = 0;
		int sum = 0;
		int tmp = number;

		int noOfDigits = String.valueOf(number).length();
		while(tmp > 0) {
			int temp = 1;
			div = tmp%10;
			for (int i = 0; i < noOfDigits; i++) {
				temp = temp * div;
			}
			sum = sum + temp;
			tmp = tmp/10;
		}

		if (sum == number)
			return true;
		else
			return false;
	}
}