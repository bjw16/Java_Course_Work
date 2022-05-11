/*--------------------- Invoice.java -------------------------------
Brandon Whyte --- Section 1

Class is preferbly used to keep information of items/parts in a store.
It should allow the user to set the part number, part description, qu-
anity of item, and price per item. It also allows the user to see this
info if prefiously initialized. Its final function (get invoice amount)
should return how much money in that part they have.
*/
public class Invoice{
	//Private data used to store part info.
	private String partNumber, partDescription;
	private int quanity;
	private double pricePerItem;

	public Invoice(){
			//Initializes everything to zero in case its not set already.
			this.partNumber = null;
			this.partDescription = null;
			this.quanity = 0;
			this.pricePerItem = 0.0;
	}

	//Set functions:
	public void setPartNumber(String number){
		this.partNumber = number;
	}

	public void setPartDescription(String description){
		this.partDescription = description;
	}

	public void setQuanity(int quanity){
		if(quanity <0)
			this.quanity = 0;
		else
			this.quanity = quanity;
	}

	public void setPricePerItem(double ppp){
		if(ppp < 0.0)
			this.pricePerItem = 0.0;																	//Used to determine if price value is a negative #.
		else
			this.pricePerItem = ppp;
	}


	//Get functions:
	public String getPartNumber(){
		return this.partNumber;
	}

	public String getPartDescription(){
		return this.partDescription;
	}

	public int getQuanity(){
		return this.quanity;
	}

	public double getPricePerItem(){
		return this.pricePerItem;
	}

	//Returns the full amount of money the stock of items cost.
	public double getInvoiceAmount(){
		return this.pricePerItem * this.quanity;
	}
}
