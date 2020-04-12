package com.agilesh.jav;

public abstract class CalculateBase 


{
	
	private double leftval;
	private double rightval;
	private double results;
	public double getLeftval() {
		return leftval;
	}
	public void setLeftval(double leftval) {
		this.leftval = leftval;
	}
	public double getRightval() {
		return rightval;
	}
	public void setRightval(double rightval) {
		this.rightval = rightval;
	}
	public double getResults() {
		return results;
	}
	public void setResults(double results) {
		this.results = results;
	}
	
	
	public CalculateBase()
	{
		
	}
	public CalculateBase(double leftval, double rightval)
	{
		this.leftval=leftval;
		this.rightval=rightval;
	}
	
	public abstract void calculate();
	

}
