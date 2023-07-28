package com.dependencyinjection.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PacmanGame")
public class PacmanGame implements GameConsole{

	@Override
	public void up() {
		System.out.println("pacmanGame moving up");
		
	}

	@Override
	public void down() {
		System.out.println("pacmanGame moving down");
		
	}

	@Override
	public void right() {
		System.out.println("pacmanGame moving right");
		
	}

	@Override
	public void left() {
		System.out.println("pacmanGame moving left");
	}

}
