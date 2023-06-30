package com.exception;
class Amount
{
	private String currency;
	private int amount;

	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}
	public String toString()
	{
		return this.currency+" "+this.amount;
	
	}
//public void add(Amount b) throws Exception { //if checked exception
	
	public void add(Amount b)  {
	// TODO Auto-generated method stub
//	if(!this.currency.equals(b.currency))
//	{
//		throw new Exception("Currency not match");
//	}
	
	if(!this.currency.equals(b.currency))
	{
		throw new RuntimeException("Currency not match");
	}
	this.amount=this.amount+b.amount;
	System.out.println(this.amount);
	
	
}
}
public class SomeOtherException {
	
	
//	public static void main(String[] args) throws Exception { //if checked exception
		
		public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Amount a=new Amount("usd",60);
		Amount b=new Amount("rs",20);
		a.add(b);

	}

}

