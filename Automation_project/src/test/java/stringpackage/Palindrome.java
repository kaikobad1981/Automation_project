package stringpackage;

public class Palindrome {
public static void main(String[] args) {
		
		String x="level";//String variable
		char y[]=x.toCharArray();//Extract data from x to y
		int size=y.length; //Calculate the size of the array
		char a[]=new char [size];//new array object
		int i=0;
		while (i!=size) { a[i]=y[i];//copy the string
		a[size-1-i]=y[i];++i;//Reverse the string
		}
		i=0;
		while (i!=size) {
			if (a[i]!=y[i]) {
				System.out.println("Not a Palindrome");
			}
			else {++i;continue;}
		}
		System.out.println("it is a Palindrome");
	}

}
