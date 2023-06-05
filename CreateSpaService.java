/*
Author : Louisgene
Date   : 5/11/2023
*/
// importation of packages
import java.util. Scanner;


public class CreateSpaService
{
	public static void main(String[] args)
	{
		// Declaration of variables and constants
		String service;
		double price;
		// creation of object
		Scanner keyboard = new Scanner(System.in);
		SpaService firstService = new SpaService();
		SpaService secondService = new SpaService();

		// Input Information for the first service
		System.out.println("Please enter name of service:>>");
		service = keyboard.nextLine();
		System.out.println("Please enter the price of that service:>>");
		price = keyboard.nextDouble();
		//Implement firstService 
		firstService.setServiceDescription(service);
		firstService.setPrice(price);
		//============end of the first service=======

		// Input information for the second service
		keyboard.nextLine();
		System.out.println("Please enter name of  second service:>>");
		service = keyboard.nextLine();
		System.out.println("Please enter the price of that service:>>");
		price = keyboard.nextDouble();
		//Implement second service
		secondService.setServiceDescription(service);
		secondService.setPrice(price);
		// ============end the second service=============
        
        // System.out.println("");
		//Display the Information for the firstService object
		System.out.println("Details for the first service:");
		System.out.println(firstService.getServiceDescription() + " $ " + firstService.getPrice());
        
        //Display the Information for the secondService object
          System.out.println("Details for the second service:");
          System.out.println(secondService.getServiceDescription() + " $ " + secondService.getPrice());
	}// end of the main

}