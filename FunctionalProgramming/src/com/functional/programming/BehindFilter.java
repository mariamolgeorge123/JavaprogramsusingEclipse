package com.functional.programming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
class BehindClass implements Predicate<Integer>
{

	

	@Override
	public boolean test(Integer t) {
		// TODO Auto-generated method stub
		return t%2==0;
	}
	
}
class Behindforeach implements Consumer<Integer>
{

	@Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub
		System.out.println(t);
		
	}
	
}
class behindMap implements Function<Integer,Integer>
{

	@Override
	public Integer apply(Integer t) {
		// TODO Auto-generated method stub
		return t*t;
	}

	
	
}
public class BehindFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List.of(3,4,6,7,8).stream().filter(x->x%2==0).forEach(x->System.out.println(x));
		System.out.println("********************************************");
		List.of(3,4,7,6,8).stream().filter(new BehindClass()).forEach(x->System.out.println(x));
		System.out.println("********************************************");
		List.of(3,4,6,7,8).stream().filter(new BehindClass()).forEach(new Behindforeach() );
		System.out.println("********************************************");
		List.of(3,4,7,6,8).stream().sorted().map(x->x*x).forEach(new Behindforeach() );
		System.out.println("********************************************");
		List.of(3,4,7,6,8).stream().sorted().map(new behindMap()).forEach(new Behindforeach() );
		System.out.println("********************************************");
	}

}
