package com.agilesh.jav;

public class Subtractor extends CalculateBase {
	
	public Subtractor()
	{
		
	}
	public Subtractor(double leftval ,double rightval)
	{
		super(leftval,rightval);
	}

	
	@override
	public void calculate()
	{
		double value = getLeftval()-getRightval();
		setResults(value);
	}
}
