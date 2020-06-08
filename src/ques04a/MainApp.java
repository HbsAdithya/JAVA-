package ques04a;

public class MainApp {

	public static void main(String[] args) {
		
		
		CreditCard card1 = CreditCard.getObject();
		CreditCard card2 = CreditCard.getObject();
		
		System.out.println(card1.Validate("IT12345678901234", 3));
		System.out.println(card1.Validate("IT12345678901235", 7));

	}

}
