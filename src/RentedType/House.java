package RentedType;

public class House extends RentedType {
	private int  numberOfRooms;
	private boolean hasGarden;
	private int numberOfFloors;
	private int rentedDayNum;
	
	public House(){
		System.out.println("House constructor. ");
	}
	
	public House(String address, String name, double size, float pricePerDay, boolean isAvailable,int numberOfRooms, boolean hasGarden, int numberOfFloors) {
		super(address,  name,  size,pricePerDay,isAvailable);
		this.numberOfRooms = numberOfRooms;
		this.hasGarden = hasGarden;
		this.numberOfFloors = numberOfFloors;
	}
	
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	public boolean isHasGarden() {
		return hasGarden;
	}
	public void setHasGarden(boolean hasGarden) {
		this.hasGarden = hasGarden;
	}
	public int getNumberOfFloors() {
		return numberOfFloors;
	}
	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}
	
	@Override
	public float calculateRentedPrice(int rentedDayNum) {
		this.rentedDayNum=rentedDayNum;
		int service=0;
		if(this.numberOfRooms>6)service+=200;
		if (this.hasGarden )service+=300;
        return (rentedDayNum*super.getPricePerDay())+(service);
		
	}

	@Override
	public String toString() {
		return "Type=" + "House" +"Rented Details" +""  +"address=" +super.getAddress() + ", name=" + super.getName() + ", size=" + super.getSize()+"numberOfRooms=" + numberOfRooms + ", hasGarden=" + hasGarden + ", numberOfFloors="
				+ numberOfFloors +  "";
	}

	
}
