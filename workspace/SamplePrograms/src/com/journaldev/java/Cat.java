package com.journaldev.java;
import java.io.IOException;
class Animal {
	public void eat() throws Exception {
		System.out.println("All animal abstractcally eats");
	}
}

class Dog extends Animal {
	public void  eat() throws IOException {
		System.out.println("Dog Eats");
	}
}

public class Cat extends Animal {
	public void eat() throws IOException {
      System.out.println("Cat eats");
	}
	public static void main(String a[]) throws Exception{
		Animal animal=new Cat();
		animal.eat();
	}
}