package com.Gunashekar.day3;
/**program to sum 4 numbers
 * @author GUNASHEKAR
 * @since 28 july 2023
 */

import java.util.Scanner;

public class Sum4Num {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		  
		System.out.println("enter the 4 numbers:" );
		int n1 =sc.nextInt();
		int n2 =sc.nextInt();
		int n3 =sc.nextInt();
		int n4 =sc.nextInt();
		int sum = (n1+n2+n3+n4);
		 System.out.println("sum:" +sum);
		
	

	}

}
