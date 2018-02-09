package com.journaldev.java8.defaultmethod;

public class MyChildClass extends MyClass implements Interface2 {

	@Override
	public void method2() {
	}

	@Override
	public void method1(String str) {
	}

	//MyClass won't compile without having it's own log() implementation
	@Override
	public void log(String str){
		System.out.println("MyChildClass logging::"+str);
		Interface1.print("log2");
	}
	
	@Override
	public void log2(String str){
		System.out.println("MyChildClass logging::"+str);
		Interface1.print("log2");
	}
	
	public static void main(String[] args) {
		MyChildClass myChildClass = new MyChildClass();
		myChildClass.log2("Jadhav");
	} 
}