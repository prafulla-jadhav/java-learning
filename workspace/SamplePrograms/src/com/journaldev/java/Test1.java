package com.journaldev.java;


interface Foo{
	int x = 10;
}
public class Test1 {
	 
	/*public static void main(String ags[]){
        String a="abc";
        String b="abc";
        System.out.println(a.equals(b));
        System.out.println(a==b);
        //System.out.println(a);
        //System.out.println(b);
    }*/
    /*public static void main(String ags[]){
        String a="abc";
        String b=new String("abc");
        System.out.println(a.equals(b));
        System.out.println(a==b);
        System.out.println(a);
        System.out.println(b);
    }*/
	public static void main(String ags[]){
        String a=new String("abc");
        String b=new String("abc");
        System.out.println(a.equals(b));
        System.out.println(a==b);
    }

}


 
