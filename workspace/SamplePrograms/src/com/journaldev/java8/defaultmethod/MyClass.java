package com.journaldev.java8.defaultmethod;

public class MyClass implements Interface1, Interface2 {

	@Override
	public void method2() {
	}

	@Override
	public void method1(String str) {
	}

	//MyClass won't compile without having it's own log() implementation
	@Override
	public void log(String str){
		System.out.println("MyClass logging::"+str);
		Interface1.print("log");
	}
	
	@Override
	public void log2(String str){
		System.out.println("MyClass logging::"+str);
		Interface1.print("log2");
	}
	
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.log("Proofs");
		
		//Functional Interfaces and Lambda Expressions
		Interface1 i1 = (s) -> System.out.println("Impl of abstract method : " + s);
		i1.method1("From Functional Interfaces and Lambda Expressions");
	}

	/*@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	} */
	
	
}