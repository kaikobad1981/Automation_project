package com.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class JavaExceptions {

public static void main(String[] args) throws IOException  {
	JavaExceptions obj=new JavaExceptions();
			//obj.arithmeticException();
			//obj.IndexOutOfBoundException();
			  obj.inputOutputException();
}
     //compile time/checked exception
	public void inputOutputException() throws IOException  {
		BufferedReader read=new BufferedReader(new FileReader("C:\\Users\\Mdjalal Kaikobad\\git\\repository\\Automation_project\\textreader"));
		System.out.println(read.readLine());
		
	}
	public void CallingIOException() {
		JavaExceptions obj=new JavaExceptions();
		
	}
//	//Runtime/Unchecked exception
	public void arithmeticException() {
		int a=12;
		int b=4;
		int c=0;
//		//***if exceptions occurred in first code and it not gonna let other code to run
		System.out.println(b/c);//Exception occurred
		System.out.println(a/b);
		System.out.println(a/c);	
	}
	
	//compile time/checked exception
	public void IndexOutOfBoundException() {
		int [] num= new int[3];
		num[0]=10;
		num[1]=15;
		num[2]=20;
		num[3]=30;
		System.out.println(Arrays.toString(num));
		
		
	}
}
