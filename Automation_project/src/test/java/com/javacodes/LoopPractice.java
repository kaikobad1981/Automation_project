package com.javacodes;

public class LoopPractice {
//	
	public static void main(String[] args) {
		
		int a=50;
		System.out.println("prime number between 1 and :"+ a );
		for(int i=2; i<100; i++){
			boolean b=true;
			for(int j=2; j<i; j++) {
				if (i%j==0) {b=false; break;}
			}
			if(b )
		System.out.println(i+" ");
		}
		}
		
	
	//}
//		
//			
//			
//			
//			
//				
//				
//		
//			
//			
//			
//		
				
						
//		int limit=100;
//		
//		//System.out.println("prime number is:");		
//		System.out.println("prime number between 1 and "+ limit);
//		for (int i = 2; i <100; i++) {	
//			boolean isPrime = true;
//			//System.out.println("prime number is:");
//			for (int j = 2; j <i; j++) {
//				if (i % j == 0) {
//					isPrime = false;
//					break;	
//				}
//			}
//			if (isPrime)
//				System.out.println(i + " ");
//				//System.out.println(i + " ");
//		}
//		}
	
//    }end of main method
//    }end of class
//
// 1,2,3,4,5,6, 
//
//--------------------------------- 
//
//j – 2 
//
//------------------------------------- 
//
//First For Loop 
//
//1<100, 2<100,3<100,4<100, 5<100, 6<100 
//
//----------------------------------- 
//
//Second For loop 
//
//2<1,  
//
//2<3
//, 3<2 
//
//2<3,3<3
// 
//
//2<4, 
//
//2<5, 3<5, 4<5, 5<5 
//
//2<6, 
//
//---------------------- 
//
//If statment 
//
//1%2 == 0 // 1==0 
//
//3%2 == 0 // 1==0 
//
//4%2 == 0 // 0==0 
//
//5%2 == 0 // 1==0 , [ 5%3 == 0 // 2 == 0],  [ 5%4 == 0 // 1==0] 
//
//6%2 == 0 // 0==0 
//
//------------ 
//
//IsPrime 
//
//True 
//
//True 
//
//True 
//
//False 
//
//True 
//
//False 
//
//--------- 
//
//Console 
//
//1,2,3,5, 

		
//		for(int i=0; i<15;i++) {
//			System.out.println(i);
//			
//		}
//		for(int i=0; i<100; i++) {
//			System.out.println(i);
//			
//		}
	}


