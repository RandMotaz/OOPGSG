package Humman;


public  class Humman {
	

	public Humman() {
		System.out.println("I am a Humman");	
	}
	public Humman(String name, String email, String phoneNum) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNum = phoneNum;
	}

	private String name;
	private String email;
	private String phoneNum;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public void getPhoneNum(String phoneNum) {
		this.phoneNum=phoneNum;
	}
	
	public String getName() {
		 return name;
	}
	
	public String getEmail() {
		 return email;
	}
	
	public String getPhoneNum() {
		 return phoneNum;
	}
	
//	public  void showContractInfo();
	
}

