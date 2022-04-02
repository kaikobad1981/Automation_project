package stringpackage;

public class CopyString {

	public static void main(String[] args) {
		String x="kaikobad";
		char y[]=x.toCharArray();
		int size=y.length;
		char a[]=new char [size];
		int i=0;
		while(i!=size){
			a[i]=y[i];++i;
		}
		System.out.println(y);
		System.out.println(a);
		
		
		}
		
		
}

//		//rules of copy of String
//		String x= "kaikobad";//String variable
//		char y[]= x.toCharArray();//extract the data from x to Y
//		int size=y.length; //calculate the size of the array
//		char a[]=new char[size];// create a new array object
//		int i=0;
//		while(i!=size){
//			a[i]=y[i];//copy the string
//			++i;} //operation
//		System.out.println(y);
//		System.out.println(a);
//
//	}
//
//}
//String name="abcdefgh";
//char[]  nm=name.toCharArray();
//for(int i =(nm.length)-1;i>=0;i--){
//System.out.print(nm[i]);

