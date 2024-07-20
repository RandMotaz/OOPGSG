package RentedType;

public class Shop extends RentedType{
	private float floorArea;
	private boolean isInMall;
	private int numberOfFloors;

	
	public Shop(){
		System.out.println("Shop constructor. ");
	}
	public Shop(String address, String name, double size, float pricePerDay, boolean isAvailable, float floorArea,boolean isInMall, int numberOfFloors) {
		super(address,  name,  size,pricePerDay,isAvailable);
		this.floorArea = floorArea;
		this.isInMall = isInMall;
		this.numberOfFloors = numberOfFloors;
	}
	
	public float getfloorArea() {
		return floorArea;
	}
	public void setfloorArea(float floorArea) {
		this.floorArea = floorArea;
	}
	public boolean isisInMall() {
		return isInMall;
	}
	public void setisInMall(boolean isInMall) {
		this.isInMall = isInMall;
	}
	
	public int getnumberOfFloors() {
		return numberOfFloors;
	}
	public void setnumberOfFloors(int numberOfFloors) {
		this.numberOfFloors =numberOfFloors;
	}
	
	@Override
	public float calculateRentedPrice(int rentedDayNum) {
	float service=0;
		if(this.numberOfFloors>6)service=service+200;
		if (this.isInMall )service=service+400;
		
        return (rentedDayNum*super.getPricePerDay()+(service));
		
	}
	@Override
	public String toString() {
		return "Type=" + "Shope " +"Rented Details" +""  +"address=" +super.getAddress() + ", name=" + super.getName() + ", size=" + super.getSize()+"floor_area=" + floorArea +  ", is_in_mall=" + isInMall
				+ ", number_of_floors=" + numberOfFloors+"";
	}
	
	
}
