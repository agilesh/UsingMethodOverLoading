package com.agilesh.jav;

public class Divider extends CalculateBase {
	
	public Divider()
	{
		
	}
	public Divider(double leftval, double rightval)
	{
		super(leftval,rightval);
	}
	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		double value = getLeftval()/getRightval();
		setResults(value);		
	}
	
	

}
