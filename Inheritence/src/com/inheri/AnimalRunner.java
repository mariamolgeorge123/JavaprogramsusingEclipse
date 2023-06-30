package com.inheri;


	abstract class Animal
	{
		abstract void bark();
	}
	class Dog extends Animal
	{

		@Override
		void bark() {
			// TODO Auto-generated method stub
			System.out.println("bow bow");
			
		}
		
	}
	class cat extends Animal
	{

		@Override
		void bark() {
			// TODO Auto-generated method stub
			System.out.println("mew-mew");
			
		}
		
	}
	public class AnimalRunner {
	public static void main(String[] args) {
		Animal[] a= {new Dog(),new cat()};
		for(Animal al:a)
		{
			al.bark();
		}
	}

}
