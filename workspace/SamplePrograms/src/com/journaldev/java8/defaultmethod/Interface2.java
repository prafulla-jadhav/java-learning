package com.journaldev.java8.defaultmethod;

@FunctionalInterface
public interface Interface2 {

	void method2();
	
	//If we add this second abstract method in Interface2, it will not remain a Functional Interface
	//void method3();
	
	default void log(String str){
		System.out.println("I2 logging::"+str);
	}
	
	default void log2(String str){
		System.out.println("I2 logging::"+str);
	}

}