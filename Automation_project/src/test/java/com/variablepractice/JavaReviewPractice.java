package com.variablepractice;

public class JavaReviewPractice {
	
	
	int a =100; //global instance vari
	
	//non return method means with void and modifier is dependence of choice
	 public void getLogin() { //non static method
	 String school="smarttach"; //local variable
	 System.out.println("school");
	 System.out.println(a);
	 
	 }
	
	 //return method must need return statement (return 5000) and datatype is int
	 public int getPayment() { //return method /no void method
		String school="smarttach"; //local variable
		 System.out.println("school");
		 System.out.println(a);
		 return 5000;//return statement
		 
		 
	 }
	 
	 
}        
