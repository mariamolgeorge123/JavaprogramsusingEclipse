package com.inheri;
interface i1
{
	public void fly();
}
class Bird implements i1
{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("bird fly");
		
	}
	
}
 class Aeroplane implements i1
{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
}

public class FlyableRunner {
	public static void main(String[] args) {
		i1[] inter= {new Bird(),new Aeroplane()};
		for(i1 data:inter)
		{
			data.fly();
		}
	}

}
