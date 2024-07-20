package RentedType;

public abstract class RentedType {
	private String address;
	

	private String name;
	private double  size;
	private float pricePerDay;
	private boolean isAvailable;
	private boolean installment;
	 
	public RentedType(){
			System.out.println("Rented Type constructor. ");
		}
	
	public RentedType(String address, String name, double size, float pricePerDay, boolean isAvailable) {
		this.address = address;
		this.name = name;
		this.size = size;
		this.pricePerDay = pricePerDay;
		this.isAvailable = isAvailable;
	}

	public void changeStatus(boolean status) {
		if(status) {
			isAvailable=false;
		}
		else {
			isAvailable=true;
		}
	}

	public abstract float calculateRentedPrice(int rentedDayNum) ;
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public boolean getInstallment() {
		return installment;
	}

	public void setInstallment(boolean installment) {
		this.installment = installment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public float getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(float pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "Rented Details" +""  +"address=" + address + ", name=" + name + ", size=" + size + ", pricePerDay=" + pricePerDay
				+ ", isAvailable=" + isAvailable ;
	}
}
