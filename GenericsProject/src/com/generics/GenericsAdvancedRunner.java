package com.generics;

public class GenericsAdvancedRunner {
	public static void main(String[] args) {
		GenericsAdvanced<Integer> ga=new GenericsAdvanced<>();
				ga.addElament(4);
		ga.addElament(4);
		ga.addElament(4);
		ga.addElament(4);
		ga.remove(4);
		System.out.println(ga);
		
		GenericsAdvanced<Long> ga1=new GenericsAdvanced<>();
		ga1.addElament(4L);
ga1.addElament(5L);
ga1.addElament(7l);
ga1.addElament(8l);
ga1.remove(4l);
System.out.println(ga1);


GenericsAdvanced<Float> ga2=new GenericsAdvanced<>();
ga2.addElament(4.1f);
ga2.addElament(4.2f);
ga2.addElament(4.3f);
ga2.addElament(4.5f);
ga2.remove(4.1f);
System.out.println(ga2);
	
	}

}
