package com.agilesh.jav;

public class Multiplier extends CalculateBase{
	public Multiplier()
	{
		
	}
	public Multiplier(double leftval,double rightval)
	{
		super(leftval,rightval);
    }
	
	public void calculate()
	{
		double value = getLeftval()*getRightval();
		setRightval(value);
	}

}
