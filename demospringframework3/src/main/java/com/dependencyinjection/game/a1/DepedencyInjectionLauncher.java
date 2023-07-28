package com.dependencyinjection.game.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.dependencyinjection.game.GameConsole;
import com.dependencyinjection.game.GameRunner;

@Component
class YourBusinessClass
{
	
	/////////FIELD DEPENDENCY INJECTION/////////////
//	@Autowired
//	Dependency1 dependency1;
//	
//	@Autowired
//	Dependency2 dependency2;
/////////FIELD DEPENDENCY INJECTION/////////////
	
	
	
	Dependency1 dependency1;
	Dependency2 dependency2;
	
/////////SETTER DEPENDENCY INJECTION/////////////
//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		System.out.println("Setter Dependency Injection-setDependency1");
//		this.dependency1 = dependency1;
//	}
//
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		System.out.println("Setter Dependency Injection-setDependency2");
//		this.dependency2 = dependency2;
//	}
/////////FIELD DEPENDENCY INJECTION/////////////
	
/////////CONSTRUCTOR DEPENDENCY INJECTION/////////////
	@Autowired  //@Autowired is not mandatory for Constructor dependency injecton
	public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("Constructor Dependency");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}
	
	//Advantage of constructor DI
//	1.Easy.@Autowired is not mandatory
//	2.dependency automaticaly set when object is created
	
/////////CONSTRUCTOR DEPENDENCY INJECTION/////////////
	
	public String toString()
	{
		return "using "+dependency1+" and "+dependency2;
	}


}
@Component
class Dependency1
{
	
}
@Component
class Dependency2
{
	
}



@Configuration
@ComponentScan
public class DepedencyInjectionLauncher {
	public static void main(String[] args) {
		try(var context=new AnnotationConfigApplicationContext(DepedencyInjectionLauncher.class))
		{
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println("***********************");
		System.out.println(context.getBean(YourBusinessClass.class));
		}
		
	}

}
