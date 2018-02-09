
public class MySingleton {
	private static MySingleton mySingleton;
	
	static {
		mySingleton = new MySingleton();
	}

	private MySingleton() {
	}

	public static MySingleton getInstance() {
		return mySingleton;
	}
	
	void test() {
		System.out.println("It's Working!!");
	}
	
	public static void main(String[] args) {
		MySingleton myInstance = getInstance();
		MySingleton myInstance1 = getInstance();
		System.out.println(myInstance.hashCode() + " " + myInstance1.hashCode());
		System.out.println(myInstance.equals(myInstance1));
		myInstance.test();
	}
}
