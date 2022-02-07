package com.javacollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
	
	public static void main(String[] args) {
		
		//HashSet does not follow any insertion order
		//HashSet do not allow any duplicate
		//HashSet is not synchronized
		//HashSet allow one null value
		
				Set <String> names = new HashSet<>();
				names.add("Mir"); 
				names.add("Franklin"); 
				names.add("Kaikobad"); 
				names.add("Maidul"); 
				names.add("Kaikobad");
				names.add("Kaikobad");
				names.add(null);
				names.add(null);
				names.add(null);
				
				System.out.println(names);
							
				//LinkedHashSet uses insertion order like a list
				//LinkedHashSet uses is not synchronized
				Set <String> names1 = new LinkedHashSet<>();
				names1.add("Mir"); 
				names1.add("Franklin"); 
				names1.add("Kaikobad"); 
				names1.add("Maidul"); 
				names1.add(null);
				names1.add(null);
				names1.add(null);
				
				System.out.println(names1);
				
				Set <String> names2 = new TreeSet<>();
				names2.add("Mir"); 
				names2.add("Franklin"); 
				names2.add("Kaikobad"); 
				names2.add("Maidul");

				System.out.println(names2);
				
				//Treeset follows ascending order
				//TreeSet do not allow null value
				Set<Integer> number = new TreeSet<>();
				number.add(60);
				number.add(24);
				number.add(100);
				number.add(99);
				//number.add(null);
			 System.out.println(number);
				
			}
	}	
	


		
//	//HashSet does not follow insertion order 
//		
//		Set<String>names=new HashSet<>();
//		names.add("Mir");
//		names.add("Franklin");
//		names.add("Kaikobad");
//		names.add("Maidul");
//		
//		System.out.println(names);
//		//LinkedHashSet uses insertion order like a list
//		Set<String>names1=new LinkedHashSet<>();
//		names1.add("Mir");
//		names1.add("Franklin");
//		names1.add("Kaikobad");
//		names1.add("Maidul");
//		System.out.println(names1);
//		
//		//
//		Set<String>names2=new TreeSet<>();
//		names2.add("Mir");
//		names2.add("Franklin");
//		names2.add("Kaikobad");
//		names2.add("Maidul");
//		System.out.println(names2);
//		
//		Set<Integer>number=new TreeSet<>();
//		number.add(60);
//		number.add(70);
//		number.add(80);
//		number.add(90);
//		System.out.println(number);
		
	