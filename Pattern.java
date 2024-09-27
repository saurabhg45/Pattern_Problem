package Patterns;

import java.util.*;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int n = sc.nextInt();

//		ABCDEF
//		BCDEFG
//		CDEFGH
//		DEFGHI
//		EFGHIJ
//		FGHIJK
//		char ch='A';
//		for(int i=0;i<=n;i++) {
//			
//			for(int j=0;j<=n;j++) {
//				System.out.print((char)(ch+i+j));
//				
//			}
//			System.out.println();
//		}

//		Enter the no: 
//			5
//			1 
//			0 0 
//			1 1 1 
//			0 0 0 0 
//			1 1 1 1 1 
//		
//		for(int i=1;i<=n;i++) {
//			for(int j=1; j<=i;j++) {
//				System.out.print("  *");
//				
//			}
//			System.out.println();
//		}
//		
//		Enter the no: 
//			5
//			 * * * * *
//			 * * * *
//			 * * *
//			 * *
//			 *
//		for(int i=0;i<=n;i++) {
//			for(int j=1;j<=n-i;j++) {
//				System.out.print(" *");
//			}
//			System.out.println();
//		}
		
		int star =1;
		int space=n-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("* ");
			}
//			for(int j=2;j<=i;j++) {
//				System.out.print("* ");
//			}
			space--;
			star++;
			System.out.println();
		}
		

		sc.close();

	}

}
