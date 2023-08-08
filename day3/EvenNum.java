package com.Gunashekar.day3;
/** program  to Evenumbers
 * @author GUNASHEKAR
 * @since 28 july 2023
 */
import java.util.Scanner;

public class EvenNum {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in) ;
		
		System.out.print("enter the Number :");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}

	}

}}
