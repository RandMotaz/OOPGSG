package Humman;

import java.util.ArrayList;

import RentedType.RentedType;

public class Owner {
	private Humman humman;
	private ArrayList<RentedType>rentedType=new  ArrayList<RentedType>();
	
	 public Owner(String name, String email, String phoneNum,RentedType rentedType) {
		 humman= new Humman(name, email, phoneNum);
		 this.rentedType.add(rentedType);
	 }
	 
	 public void addRented(RentedType rentedType) {
		 this.rentedType.add(rentedType);
	 }
	 
	 public void removeRented(RentedType rentedType) {
		 this.rentedType.remove(rentedType);
	 }
	 
	 @Override
		public String toString() {
			return "Owner name=" + humman.getName()+ ", email=" + humman.getEmail() + ", phoneNum=" + humman.getPhoneNum() + "";
		}

	public ArrayList<RentedType> getRentedType() {
		return rentedType;
	}

	public void setRentedType(ArrayList<RentedType> rentedType) {
		this.rentedType = rentedType;
	}
}
