package com.game.gamerunner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//import com.game.spring.GameBean;
import com.game.spring.GameConsole;
import com.game.spring.GameInterfaceBean;
import com.game.spring.PacmanGame;

//@Configuration
// class GameBean {
//	@Bean
//	public GameInterfaceBean game()
//	{
//		var game=new PacmanGame();
//		return game;
//	}
//	@Bean
//	public GameConsole gameconsole(GameInterfaceBean game)
//	{
////		var gameconsole=new GameConsole(new PacmanGame());
//		var gameconsole=new GameConsole(game);
//		return gameconsole;
//	}
//}
@Configuration
@ComponentScan("com.game.spring")
@ComponentScan("com.game.spring")
//@ComponentScan("com.game.spring")
public class GameConsoleBeanRunner {
//	@Bean
//	public GameInterfaceBean game()
//	{
//		var game=new PacmanGame();
//		return game;
//	}
//	@Bean
//	public GameConsole gameconsole(GameInterfaceBean game)
//	{
////		var gameconsole=new GameConsole(new PacmanGame());
//		var gameconsole=new GameConsole(game);
//		return gameconsole;
//	}
	public static void main(String[] args) {
		try(var context=new AnnotationConfigApplicationContext(GameConsoleBeanRunner.class))
		{
			context.getBean(GameInterfaceBean.class).up();
			System.out.println("********************************");
			context.getBean(GameConsole.class).run();
		}

	}

}
