package stringpackage;

import java.util.Arrays;

public class SplitString {

	public static void main(String[] args) {
		String love="I love my Mom";//Create string Variable
		String Jamal[]=love.split(" ");//Divided the String by split method by using Array
		
		System.out.println(Arrays.toString(Jamal));//Use Array class to convert the--
		                                            //--string in to one char or int

	}

}
