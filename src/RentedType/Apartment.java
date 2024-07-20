package RentedType;

public class Apartment extends RentedType{
	private int numberOfRooms;
	private int floorNumber;
	private int rentedDayNum;
	private boolean hasElevator;
	
	public Apartment(){
		System.out.println("Apartment constructor. ");
	}


	public Apartment(String address, String name, double size, float pricePerDay, boolean isAvailable,int numberOfRooms, int floorNumber,boolean hasElevator) {
		super(address,  name,  size,pricePerDay,isAvailable);
		this.numberOfRooms = numberOfRooms;
		this.floorNumber = floorNumber;
		this.hasElevator=hasElevator;
	}




	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}
	
	@Override
	public float calculateRentedPrice(int rentedDayNum) {
		//where 100 is elevator services
		int service=0;
		this.rentedDayNum=rentedDayNum;
		if (this.hasElevator)service=100;
        return (rentedDayNum*super.getPricePerDay())+(service);
		
	}
	
	public boolean isHasElevator() {
		return hasElevator;
	}


	public void setHasElevator(boolean hasElevator) {
		this.hasElevator = hasElevator;
	}


	@Override
	public String toString() {
		return "Type=" + "Apartment" +"Rented Details" +""  +"address=" +super.getAddress() + ", name=" + super.getName() + ", size=" + super.getSize() 
				+"numberOfRooms=" + numberOfRooms + ", floorNumber=" + floorNumber +"";
	}

	

}
