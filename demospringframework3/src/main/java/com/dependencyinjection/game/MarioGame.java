package com.dependencyinjection.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GameConsole {

	@Override
	public void up() {
		System.out.println("MarioGame moving up");
		
	}

	@Override
	public void down() {
		System.out.println("MarioGame moving down");
		
	}

	@Override
	public void right() {
		System.out.println("MarioGame moving right");
		
	}

	@Override
	public void left() {
		System.out.println("MarioGame moving left");
		
	}

}
