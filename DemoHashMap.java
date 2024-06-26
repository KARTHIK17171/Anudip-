package com.collections;

import java.util.HashMap;

public class DemoHashMap {

	public static void main(String[] args) {
		
		//OBJECT CREATION FOR HASHMAP 
	HashMap<Integer,String> Countrycd=new HashMap<Integer,String>();
	//insertion of COUNTRY & ITS CODE INTO THE SET
	Countrycd.put(91,"INDIA");
	Countrycd.put(93, "AFGHANISTHAN");
	Countrycd.put(86, "CHINA");
	Countrycd.put(33, "GERMANY");
	Countrycd.put(57,"COLOMBIA");
	Countrycd.put(null, "FIJI");
	
	//printing 
	System.out.println("COUNTRY AND ITS CODES\n"+Countrycd);
	//PRINTING THE 93 CODE COUNTRY NAME
	System.out.println(Countrycd.get(93));
	
	//REPLACING THE 33 KEY
	Countrycd.replace(33, "FRANCE");
	
	//PRINTING THE ELEMENTS 
	System.out.println(Countrycd);
	}

}
