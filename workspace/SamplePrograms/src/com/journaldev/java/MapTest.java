package com.journaldev.java;
import java.util.HashMap;
import java.util.Map;
public class MapTest {
    public static void main(String aga[]){
        Map m= new HashMap();
        m.put(null, "Test");
        m.put(null,"Fest");
        m.put(null, "proofs");
        m.put("PJ", "Prafulla");
        m.put("PJ", "Jadhav");
        System.out.println(m);
    }
}