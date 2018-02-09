package com.journaldev.java;
import java.util.HashSet;
  
class Animala {
    public int i=12;
     
    public Animala(){
        i=13;
    }
    public String toString(){
        return "Animal"+i;
    }
}
public class Test {
    public static void main(String [] args) throws Exception {
       HashSet<Animala> s= new HashSet<Animala>();
       s.add(new Animala());
       s.add(new Animala());
       for(Animala a : s){
           System.out.println(a);
       }
    }
}
