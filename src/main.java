import java.util.Date;

import Contracts.Contracts;
import Humman.Customer;
import Humman.Humman;
import Humman.Owner;
import PaymantMethod.CardPayment;
import PaymantMethod.Paypal;
import RentedType.Apartment;
import RentedType.House;
import RentedType.RentedType;
import RentedType.Shop;

public class main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		
		   //address, name,  size, pricePerDay, isAvailable, numberOfRooms, floorNumber, hasElevator
		    Apartment apartment = new Apartment("123 Main St, Apt 4B", "Downtown Apartment", 85.0, 120, true, 3, 4, true);
//	        System.out.println(apartment);
//	        System.out.println("Total rent for 10 days: " + apartment.calculateRentedPrice(10));
//	        apartment.changeStatus(apartment.isAvailable());
//	        System.out.println("Apartment availability status changed: " + apartment.isAvailable());
	        

	        // Creating a House object
	        // address,  name, size,  pricePerDay, isAvailable, numberOfRooms, hasGarden, numberOfFloors
	        House house = new House("456 Elm St", "Suburban House", 250.0, 200, true, 9, true, 2);
	       // System.out.println(house);
//	        System.out.println("Total rent for 10 days: " + house.calculateRentedPrice(10));
//	        house.changeStatus(house.isAvailable());
//            System.out.println("House availability status changed: " + house.isAvailable());

	        // Creating a Shop object
	        //address, name, size,  pricePerDay, isAvailable,floorArea,isInMall,numberOfFloors
	        Shop shop = new Shop("789 Maple Ave", "Mall Shop", 120, 1500, true, 60, true, 8);
//	        System.out.println(shop);
//	        System.out.println("Total rent for 10 days: " + shop.calculateRentedPrice(10));
//	        shop.changeStatus(shop.isAvailable());
//            System.out.println("Shop availability status changed: " + shop.isAvailable());
		
		    Paypal paypal = new Paypal("randabdallah787@gmail.com", "password123");
		  
	        CardPayment visa = new CardPayment("4111111111111111", new Date(2024,8,15), "Visa");

	        // Create a customer with a PayPal payment method
	        Customer customer = new Customer("Rand Motaz", "randabdallah787@gmail.com", "05994617411", paypal);
	       // System.out.println(customer);
	        paypal.setPaypal(true);
	        customer.addPaymantMethod(visa);
//	        paypal.pay(100.0f);
//	        visa.pay(150.0f);
	        visa.setCard(true);
	        
	        //String name, String email, String phoneNum,RentedType rentedType
	        Owner owner=new Owner("Ali Rayan","alirayan123@gmail.com","0599303821",apartment);
	        owner.addRented(house);
	        owner.addRented(shop);
	      //  owner.removeRented(shop);

//	        customer.removePaymantMethod(paypal);
//	        paypal.setPaypal(false);
//            paypal.pay(50.0f);
	       
	    //Downtown Apartment Mall Shop Suburban House
		
		 Contracts contract = new Contracts(customer, owner, apartment, "Mall Shop", new Date(2024,8,12), new Date(2024,8,15));
//		 System.out.println(contract);

	}

}
