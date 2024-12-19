package com.DemowebShop.genericLib;

import java.util.Random;

public class WorkLib {
	
	public static int getRandomNo(int bound)
	{
		Random r = new Random();
		return r.nextInt(bound);
	}

}
