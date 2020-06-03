package ques01;

public abstract class Item {
	
	private int itemNo;
	private String description;
	private double unitPrice;
	/**
	 * @param itemNo
	 * @param description
	 * @param unitPrice
	 */
	public Item(int itemNo, String description, double unitPrice) {
		this.itemNo = itemNo;
		this.description = description;
		this.unitPrice = unitPrice;
	}
	
	public void Display() {
		System.out.println(itemNo);
		System.out.println(description);
		System.out.println(this.unitPrice);
	}
	
	

}
