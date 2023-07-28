package com.game.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameConsole {
	GameInterfaceBean game;
	public GameConsole(@Qualifier("PacmanGameQualfier") GameInterfaceBean game) {
		super();
		this.game = game;
	}

	public void run()
	{
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
