package com.javacollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import groovy.lang.MetaClassImpl.Index;
public class ListExamples {

	public static void main(String[] args) {
		
		
		//Integer is data type and wrapper class from java
			List <Integer> number = new ArrayList <Integer>();
			number.add(10); // index 0
			number.add(15); // index 1 
			number.add(20); // index 2
			number.add(22); // index 3
			number.add(15); // index 4
			number.add(15);
			number.add(22);
			number.add(22);
			number.add(null);    //we can add, remove, search it allows null value also
			number.add(null);
			number.add(null);
			number.add(null);
			number.add(22);
			number.add(22);
			
			//If I want to check the size 
			System.out.println(number.size());
			
			//If we want to get a specific value at an index
			System.out.println(number.get(2));
			System.out.println(number.get(0));
			
			//If we want to print the whole List
			System.out.println(number);	
			//Using the basic loop
			for (int i = 0; i<number.size(); i++) {
				System.out.println(number.get(i));
			}
			
			//Using the advance loop
			for (Integer i : number) {
				System.out.println(i);
			}
			
			//Different way to add in the list
			List <Integer> number1 = new ArrayList <>();
			number1.add(35);
			
			List <String> names = new ArrayList <>();
			names.add("Mir");
			names.add("Franklin");
			names.add("Kaikobad");
			
			// Generic List
			List myList = new ArrayList();
			myList.add(10);
			myList.add("Name");
			
			//another way to write List
			
			List <Integer> number2 = new ArrayList <Integer>(Arrays.asList(15,17));

		
			//LinkedList Example
			
			List <String> names1 = new LinkedList <>();
			names1.add("Arif");
			names1.add("Mir");
			names1.add("Franklin");
			names1.add("Kaikobad");
           System.out.println(names1.size());
		
         //If and else condition to search in Collection
   		
   		if (names.contains("Maiduls")) {
   			System.out.println("The list contains name Maidul");
   		} else if (names.contains("Kaikobad")){
   			System.out.println("The list contains name Kaikobad");
   		} else {
   			System.out.println("The list does not contain the names mentioned");
   		}
           
           
//			List <Integer> num = new LinkedList <>();
//			num.add(10); // index 0
//			num.add(15); // index 1 
//			num.add(20); // index 2
//			num.add(22); // index 3
//			num.add(15); // index 4
//			num.add(15);
//			System.out.println(num.size());
			
			
//			List <String> names2 = new Vector <>();
//			names2.add("LastName");
//			names2.add("LastName");
//			
						
	}
			}
     


		//if we want to check the size
//		System.out.println(number.size());
//		
//		//if we want to print the specific from list
//		System.out.println(number.get(2));
//		System.out.println(number.add(0));
//		//if we want to print the whole list 
//		System.out.println(number);
//		//Using the basic loop
//		for (int i=0;i<number.size();i++) {
//			System.out.println(number.get(i)); //
//			
//		}
//		//Using advance loop
//		for (Integer i:number);
//			
//		
//		
//		
//	}


