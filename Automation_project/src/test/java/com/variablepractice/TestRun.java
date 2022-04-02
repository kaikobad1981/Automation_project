package com.variablepractice;

public class TestRun {
	
	public static void main(String[] args) {
		//call getLogin & getPayment both are nonstatic
		//calling method if non static
//		int a=10;//as per java rules a and 10 is equal

// need to create object for nostatic//this is constructor
//		JavaReviewPractice obj=new JavaReviewPractice();
//		obj.getLogin();
//		obj.getPayment();
		
		//
		//as per java rules we can call method below way also
		//most dev. use it
	new JavaReviewPractice().getLogin();
	new JavaReviewPractice().getPayment();
//		
		//calling method if static
//		JavaReviewPractice.getLogin();
//		JavaReviewPractice.getPayment();
//		
	}

}
