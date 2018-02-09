
public class JavaPassByValue {

	private int i = 20 ; 
	public static void main(String[] args) {
		JavaPassByValue javaPassByValue = new JavaPassByValue();
		javaPassByValue.testPassByValue();
	}

	private void testPassByValue() {
		//i = 10;
		modifyVal(i);
		System.out.println("Orig " + i);
	}

	private void modifyVal(int i) {
		i++;
		System.out.println(i);
	}
}
