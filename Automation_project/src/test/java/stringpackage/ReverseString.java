package stringpackage;

public class ReverseString {

	public static void main(String[] args) {
		
//		String name="abcdefgh";
//		char[]  nm=name.toCharArray();
//		for(int i =(nm.length)-1;i>=0;i--){
//		System.out.print(nm[i]);
		
		String x="1234567";
		char y[]=x.toCharArray();
		int size=y.length;
		char a[]=new char[size];
		int i=0;
		while(i!=size) {
			a[i]=y[i];
			a[size-1-i]=y[i];++i;
					
		}
		System.out.println(y);
		
		System.out.println(a);
		}
		
		
		}




//String x="12345678";//string variable
//char y[]=x.toCharArray();//Extract the data from string x to y array
//int size=y.length;//calculate the size of the array
//char a[]=new char [size];//new array object
//int i=0;
//while(i!=size) {
//	      //a[i]=y[i];//copy the string
//          a[size-1-i]=y[i];//Reverse the string
//          ++i;//operation
//	      }
//
//
//System.out.println(y);
//System.out.println(a);
