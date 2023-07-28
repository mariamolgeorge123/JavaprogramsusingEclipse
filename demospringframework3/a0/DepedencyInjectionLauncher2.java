package com.dependencyinjection.game.a0;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.dependencyinjection.game.GameConsole;
import com.dependencyinjection.game.GameRunner;

@Configuration
@ComponentScan
public class DepedencyInjectionLauncher2 {
	public static void main(String[] args) {
		try(var context=new AnnotationConfigApplicationContext(DepedencyInjectionLauncher2.class))
		{
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
		
	}

}
