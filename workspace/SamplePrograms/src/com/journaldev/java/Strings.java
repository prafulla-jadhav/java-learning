package com.journaldev.java;
public class Strings {
	private static String STATIC="working";
	private String a = null;
	/*public static void main(String ads[]){
		String a="working";
		Strings st= new Strings();
		st.a="working";
		System.out.println(Strings.STATIC==a);
		System.out.println(Strings.STATIC.equals(st.a));
	}*/
	
	 /*public static void main(String ads[]){
	        String arr[]={"meow","bray","moo"};
	        String a="meow";
	        System.out.println(arr[0]==a);
	    }*/
	  /*public static void main(String ads[]){
	        String a="meow";
	        String ab=a+"deal";
	        String abc="meowdeal";
	        System.out.println(ab);
	        System.out.println(abc);
	        System.out.println(ab==abc);
	    }*/
	public static void main(String ads[]){
        String abc="abc";
        String bed="bed";
        String comb="abcBED";
        String newComb = abc+bed;
        System.out.println(abc+bed.equalsIgnoreCase(comb));
        System.out.println(newComb.equalsIgnoreCase(comb));
    }
}