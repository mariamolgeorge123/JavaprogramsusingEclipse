package com.dependencyinjection.game;

import org.springframework.stereotype.Component;

@Component
public class SupercontraGame implements GameConsole{

	@Override
	public void up() {
		System.out.println("SupercontraGame moving up");
		
	}

	@Override
	public void down() {
		System.out.println("SupercontraGame moving down");
		
	}

	@Override
	public void right() {
		System.out.println("SupercontraGame moving right");
	}

	@Override
	public void left() {
		System.out.println("SupercontraGame moving left");
		
	}

}
