package com.journaldev.java;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestMe {
	public static void main(String[] args) {
		System.out.println("Me");
	}
	class Animal {
		 void eat() throws IOException {
			System.out.println("Animal");
		}
	}
	class Dog extends Animal {
		public void  eat() throws FileNotFoundException {//You can throw subtype exception, but can't throw superclass exception
			System.out.println("Dog");
		}
	}
}