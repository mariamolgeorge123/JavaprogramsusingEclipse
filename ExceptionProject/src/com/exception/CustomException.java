package com.exception;


class AmountData
{
	private String currency;
	private int amount;

	public AmountData(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}
	public String toString()
	{
		return this.currency+" "+this.amount;
	
	}
	
	public void add(AmountData b)  throws CurrencyException{

		
		if(!this.currency.equals(b.currency))
		{
			throw new CurrencyException("currency not match");
		}
		this.amount=this.amount+b.amount;
		System.out.println(this.amount);
		
		
	}
}

class CurrencyException extends Exception
{
	public CurrencyException(String msg)
	{
	super(msg);
	}
}

public class CustomException {

	public static void main(String[] args) throws CurrencyException{
		// TODO Auto-generated method stub
		
		AmountData a=new AmountData("usd",60);
		AmountData b=new AmountData("rs",20);
		a.add(b);

	}

}
