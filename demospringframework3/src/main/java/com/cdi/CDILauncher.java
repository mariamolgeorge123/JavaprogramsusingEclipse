package com.cdi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.dependencyinjection.game.GameConsole;
import com.dependencyinjection.game.GameRunner;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component
@Named
class BusinessService
{
	
	private DataService dataservice;
	
	public DataService getDataservice() {
		return dataservice;
	}
//	@Autowired
	@Inject
	public void setDataservice(DataService dataservice) {
		System.out.println("Seetter Injection");
		this.dataservice = dataservice;
	}
	
}
//@Component
@Named
class DataService
{
	
}

@Configuration
@ComponentScan
public class CDILauncher {
	public static void main(String[] args) {
		try(var context=new AnnotationConfigApplicationContext(CDILauncher.class))
		{
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println("*******************");
		System.out.println(context.getBean(BusinessService.class));
		}
		
	}

}
