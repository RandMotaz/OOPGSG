package Contracts;

import java.util.ArrayList;
import java.util.Date;

import Humman.Customer;
import Humman.Owner;
import RentedType.RentedType;

public class Contracts {

	
	   private Customer customer;
	    private Owner owner;
	    private RentedType rentedType;
	    private Date startDate;
	    private Date endDate;
	    private float totalPrice;
	    private String rentedTypeName;
	    private int index;
	    private ArrayList<RentedType>rentedList=new  ArrayList<RentedType>();

	     public Contracts(Customer customer, Owner owner, RentedType rentedType,String rentedTypeName, Date startDate, Date endDate) {
	        this.customer = customer;
	        this.owner = owner;
	        this.rentedType = rentedType;
	        this.startDate = startDate;
	        this.endDate = endDate;
	        this.rentedTypeName=rentedTypeName;
	       
	        calculateTotalPrice();
	    }

	    private void calculateTotalPrice() {
	    	
	    	boolean isAvalibale=false;
	    	
	    	
	    	rentedList=this.owner.getRentedType();
	    	for(int i=0;i<rentedList.size();i++) {
	    		if(rentedList.get(i).getName().equals(rentedTypeName)) {
	    			isAvalibale=true;
	    			index=i;
	    			break;
	    		}
	    	}
	    	if(isAvalibale) {
	        long durationInMillis = endDate.getTime() - startDate.getTime();
	        int rentedDays = (int) (durationInMillis / (1000 * 60 * 60 * 24));
	        this.totalPrice = rentedType.calculateRentedPrice(rentedDays);
	        
	        System.out.println(this);
	    	}
	    	else {
	    		System.out.println("Sorry!! Owner does not have this rented type");
	    	}
	    }


	    public Customer getCustomer() { return customer; }
	    public void setCustomer(Customer customer) { this.customer = customer; }
	    public Owner getOwner() { return owner; }
	    public void setOwner(Owner owner) { this.owner = owner; }
	    public RentedType getRentedType() { return rentedType; }
	    public void setRentedType(RentedType rentedType) { this.rentedType = rentedType; }
	    public Date getStartDate() { return startDate; }
	    public void setStartDate(Date startDate) { this.startDate = startDate; }
	    public Date getEndDate() { return endDate; }
	    public void setEndDate(Date endDate) { this.endDate = endDate; }
	    public float getTotalPrice() { return totalPrice; }

	    @Override
	    public String toString() {
	        return "Contract Details: \nCustomer: " + customer + "\nOwner: " + owner + "\nRented Type: " + rentedList.get(index)
	            + "\nStart Date: " + startDate + "\nEnd Date: " + endDate + "\nTotal Price: " + totalPrice;
	    }
}
