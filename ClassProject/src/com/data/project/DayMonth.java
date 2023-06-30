package com.data.project;

public class DayMonth {
	

	public void nameMonth(int i) {
		// TODO Auto-generated method stub
		switch(i)
		{
			case 1:System.out.println("January");
					break;
			case 2:System.out.println("February");
					break;
			case 3:System.out.println("March");
					break;
			case 4:System.out.println("April");
					break;
			case 5:System.out.println("May");
					break;
			case 6:System.out.println("June");
					break;
			case 7:System.out.println("July");
					break;
			case 8:System.out.println("August");
					break;
			case 9:System.out.println("September");
					break;
			case 10:System.out.println("October");
					break;
			case 11:System.out.println("November");
					break;
			case 12:System.out.println("December");
					break;
			default:System.out.println("not a valid Month");
					break;
		}
		
	}

	

	public void nameDay(int i) {
		// TODO Auto-generated method stub
		switch(i)
		{
		
			case 0:System.out.println("Sunday");
					break;
			case 1:System.out.println("Monday");
					break;
			case 2:System.out.println("Tuesday");
					break;
			case 3:System.out.println("Wednesday");
					break;
			case 4:System.out.println("Thurseday");
					break;
			case 5:System.out.println("Friday");
					break;
			case 6:System.out.println("Saturday");
					break;
			default:System.out.println("not a valid Day");
					break;
		}
	
		
	}





	public boolean isWeekDay(int i) {
		// TODO Auto-generated method stub
		if(i==1 || i==6)
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}



	
	public boolean isEven(int i) {
		// TODO Auto-generated method stub
		boolean g=(i%2==0?true:false);
		return g;
	}

}
