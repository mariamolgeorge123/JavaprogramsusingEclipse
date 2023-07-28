package com.game.spring;

import org.springframework.stereotype.Component;

@Component 
public class SupeCntraGame implements GameInterfaceBean {

	@Override
	public void up() {
		System.out.println("Supercontra moving up");
		
	}

	@Override
	public void down() {
		System.out.println("Supercontra moving down");
		
	}

	@Override
	public void left() {
		System.out.println("Supercontra moving back");
		
	}

	@Override
	public void right() {
		System.out.println("Supercontra moving forward");
		
	}

}
