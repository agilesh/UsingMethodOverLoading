package com.agilesh.jav;

public class Inheritance {


	public static void main(String args[])
	{

		System.out.println("USING INHERITANCE");
		CalculateBase[] calculate = {
		   new Divider(100.0d,50.0d),
		   new Adder(25.0d, 23.0d),
		   new Subtractor(120.0d,3.0d),
		   new Multiplier(12.0d,3.0d)
	};
		
		for(CalculateBase cal:calculate)
		{
			cal.calculate();
			System.out.println("result");
			System.out.println(cal.getResults());
		}
	
	}
}