package Patterns;

import java.util.*;
public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the num: ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print((i+j)%2);
			}
			System.out.println();
		}
		sc.close();

	}

}
