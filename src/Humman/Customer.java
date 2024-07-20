package Humman;

import java.util.ArrayList;

import PaymantMethod.PaymantMethod;


public class Customer {



private Humman humman;



 private  ArrayList< PaymantMethod> paymantMethod= new ArrayList< PaymantMethod>();

 
public Customer(String name, String email, String phoneNum,PaymantMethod paymantMethod) {
	 humman= new Humman(name, email, phoneNum);
	 this.paymantMethod.add(paymantMethod);
	
  }


public void addPaymantMethod(PaymantMethod paymantMethod) {
	 this.paymantMethod.add(paymantMethod);
	//  System.out.println(this.paymantMethod.size());
}






public void removePaymantMethod(PaymantMethod paymantMethod) {
	 this.paymantMethod.remove(paymantMethod);
	// System.out.println(this.paymantMethod.size());
}


@Override
	public String toString() {
	return "Customer name=" + humman.getName()+ ", email=" + humman.getEmail() + ", phoneNum=" + humman.getPhoneNum() + "";
	}

}
