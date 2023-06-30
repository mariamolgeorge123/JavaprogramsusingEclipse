package com.inheri;

public abstract class ReceipeAbstract {
	public void execute()

	{
		prepare();
		make();
	}
abstract void prepare();
abstract void make();
}
