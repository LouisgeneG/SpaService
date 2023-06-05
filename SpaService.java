/*
Author : Louisgene
Date   : 5/11/2023
*/
// Excercise Chap 3

public class SpaService
{
	// Declaration of variables
  private String serviceDescription;
  private double price;

  //New construtor method for this SpaService
   public SpaService()
   {
   	serviceDescription = "Basic Service";
   	price = 15.99;
   }

  // creation of Method setServiceDescription()
 public void setServiceDescription( String service)
 {
 	serviceDescription = service;

 }// end of method setServiceDescription 

 //Creation of method setPrice()
 public void  setPrice( double servicePrice)
 {
    price = servicePrice;
 }// end of method setPrice

 //creation of method getServiceDescription()
 public String getServiceDescription()
 {
   return serviceDescription;
 }// end of method

//creation of method getPrice()
 public double getPrice()
 {
 	return price;
 }// end of method






}
