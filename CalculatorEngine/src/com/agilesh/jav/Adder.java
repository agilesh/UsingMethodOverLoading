package com.agilesh.jav;

public class Adder extends CalculateBase {
	
	public Adder()
	{
		
	}
	public Adder(double leftval ,double rightval)
	{
		super(leftval,rightval);
	}

	
	@override
	public void calculate()
	{
		double value = getLeftval()+getRightval();
		setResults(value);
	}
}
