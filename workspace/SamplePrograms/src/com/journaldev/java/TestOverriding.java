package com.journaldev.java;
import java.io.IOException;
/*public class TestOverriding {
    public static void main(String aga[]){
    Test2 t =new Fest1();
    t.tests();
    }
}*/
/*class Test2{
    void tests(){//if it were static and subclass method was not static then subclass method shows-
    	// This instance method cannot override the static method from Test2 at compile time
    //static void tests(){//if it were static, then no compilation probelm 
        System.out.println("Test class : tests");
    }
}
class Fest1 extends Test2{
    static void tests(){//This static method cannot hide the instance method from Test2
        System.out.println("Fest class : tests");
    }
}*/
/*public class TestOverriding {
    public static void main(String aga[]){
    Test t =new Fest();
    t.tests();
    }
}
class Test{
     private void tests(){
        System.out.println("Test class : tests");
    }
}
class Fest extends Test{
    public void tests(){
        System.out.println("Fest class : fests");
    }
}*/
/*public class TestOverriding {
    public static void main(String aga[]){
    Super superRef =new Sub();
    Sub subRef = new Sub();
    Super suRef=new Super();
     
    superRef.tests();
    subRef.tests();
    suRef.tests();
    
    Super.tests();
    Sub.tests();
    Sub.tests();
    }
}
class Super{
     public void tests(){
        System.out.println("Super static");
    }
}
class Sub extends Super{
    public void tests(){
        System.out.println("Sub static");
    }
}*/

/*public class TestOverriding {
    public static void main(String aga[]){
        Parrot bird=new Parrot();
        bird.fly();
    }
}
class Bird{
     private  void fly(){
        System.out.println("Bird is flying");
    }
}
class Parrot extends Bird{
    public void doStuff(){
        System.out.println("I am parrot , and I am doing stuff");
    }
}*/


