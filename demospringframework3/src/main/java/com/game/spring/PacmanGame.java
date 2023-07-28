package com.game.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component  //for spring create bean itself
@Qualifier("PacmanGameQualfier")
public class PacmanGame implements GameInterfaceBean{

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("moving up");
		
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("moving down");
		
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("moving back");
		
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("moving forwrd");
		
	}

}
