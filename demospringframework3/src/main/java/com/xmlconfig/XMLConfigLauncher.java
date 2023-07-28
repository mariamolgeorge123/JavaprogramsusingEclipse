package com.xmlconfig;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import com.dependencyinjection.game.a0.DepedencyInjectionLauncher2;



	public class XMLConfigLauncher {
		public static void main(String[] args) {
			try(var context=new ClassPathXmlApplicationContext("XMLConfiguatin.xml"))
			{
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("gamepacman"));
			System.out.println(context.getBean("mariogame"));
			System.out.println(context.getBean("supercontragame"));
			
			System.out.println("*******************");
//			context.getBean(GameConsole.class).run();
			}
			
		}

}
