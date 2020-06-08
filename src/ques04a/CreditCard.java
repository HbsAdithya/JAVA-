package ques04a;

public class CreditCard {
	
	public static CreditCard card = null;

	private CreditCard() {
	}
	
	public static CreditCard getObject () {
		
		if ( card == null ) {
			card = new CreditCard();
			System.out.println("new Object Created!");
		}
		else {
			System.out.println("Returning Existing object");
		}
		return card;
	}
	
	public boolean Validate (String cardNo,int code) {
		int remainder = code % 3;
		
//		if (cardNo.length() == 16 && remainder == 0 ) {
//			return true;
//		}
//		else {
//			return false;
//		}
		return (cardNo.length() == 16 && remainder == 0);
	}
	
	

}
