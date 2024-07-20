package PaymantMethod;

import java.util.Date;

public class CardPayment  implements PaymantMethod {
	private String cardNumber;
	private Date expiryDate;
	private boolean card=false;
	private String cardType;// (Visa, MasterCard)
	
	public CardPayment(String cardNumber, Date expiryDate, String cardType) {
		
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
		this.cardType = cardType;
		this.card=true;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public boolean isCard() {
		return card;
	}


	public void setCard(boolean card) {
		this.card = card;
	}

	
	@Override
	public void pay(float amount) {
		if(card)System.out.println("From CardPayment - "+this.cardType+" - You should pay = "+amount); else  System.out.println("Sorry!!You do not have card");
		
		
	}

}
