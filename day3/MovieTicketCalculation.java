package com.Gunashekar.day3;

import java.util.Scanner;

/** Program to generate movie ticket calculation
 * @author GUNASHEKAR
 *@ since 28th july 2023
 */
public class MovieTicketCalculation {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
		 
		 System.out.println("how many number of pizza; ");
		 int pizza =  sc.nextInt();
	      
		 System.out.println(" how many number of puffs; ");
		 int puffs = sc.nextInt();
		 
		 System.out.println("how many number of drinks; ");
		 int drinks =  sc.nextInt();
		 
		 System.out.println("Bill details");
		 System.out.println("no of pizzas:" +pizza);
		 System.out.println("no of puffs:" +puffs);
		 System.out.println("no of drinks:" +drinks);
		 
		 int total = (pizza*100)+(puffs*25)+(drinks*40);
		 System.out.println("total price:" +total);
		 
		 System.out.println("enjoy the show");
	}

}
