package com.Gunashekar.day2;
/** program to Generate movie bill
 * @author GUNASHEKAR
 * @since 26th july 2023
 */
import java.util.Scanner;

public class BillGeneration {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("How many nunber of pizzas:");
			int pizza = sc.nextInt();
			
			System.out.print("how many number of puffs:");
			int puffs = sc.nextInt();
			System.out.print("how many number of drinks:");
			int drinks = sc.nextInt();
			System.out.println("Bill Details");
			System.out.println("no of pizzas:" +pizza);
			System.out.println("no of puffs:" +puffs);
		    
			System.out.println("no of drinks:" +drinks);
			 int  total =(pizza*100)+(puffs*20)+(drinks*10);
			 System.out.println ("total price:"+total);
			 System.out.println("Enjoy the show!!!!!");

	}

}
