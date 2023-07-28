package com.game.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GameInterfaceBean {

	@Override
	public void up() {
		System.out.println("mario moving up");
		
	}

	@Override
	public void down() {
		System.out.println("mario moving down");
		
	}

	@Override
	public void left() {
	
		System.out.println("mario moving back");
	}

	@Override
	public void right() {
		
		System.out.println("mario moving forward");
	}

}
