package PaymantMethod;

public class Paypal implements PaymantMethod{
	
	private String email;
	private String password;
	private boolean paypal=false;
	
	public Paypal(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isPaypal() {
		return paypal;
	}


	public void setPaypal(boolean paypal) {
		this.paypal = paypal;
	}

	@Override
	public void pay(float amount) {
		if(paypal)System.out.println("From Paypal You should pay = "+amount);else  System.out.println("Sorry!!You do not have paypal");
		
	}

	

}
