package com.agilesh.jav;

public class MathEquation {

	private double leftvals;
	private double rightvals;
	private char opcodes='a';
	private double results;
	
	public double getLeftvals() {
		return leftvals;
	}

	void setLeftvals(double leftvals) {
		this.leftvals = leftvals;
	}

	public double getRightvals() {
		return rightvals;
	}

	public void setRightvals(double rightvals) {
		this.rightvals = rightvals;
	}

	public char getOpcodes() {
		return opcodes;
	}

	public void setOpcodes(char opcodes) {
		this.opcodes = opcodes;
	}

	public double getResults() {
		return results;
	}

	
	public MathEquation()
	{
		
	}
	public MathEquation(char opcodes)
	{
		this.opcodes=opcodes;
	}
	public MathEquation(char opcodes , double leftvals , double rightvals)
	{
		this(opcodes);
		this.leftvals=leftvals;
		this.rightvals=rightvals;
	}
	
	
	
	public void execute(double leftvals , double rightvals)
	{
		this.leftvals=leftvals;
		this.rightvals=rightvals;
		execute();
		results =(int)results;
	}
	
	public void execute(int leftvals , int rightvals)
	{
		this.leftvals=leftvals;
		this.rightvals=rightvals;
		execute();
	}
	
	
	
	
	public void execute()
	{
		
		switch(opcodes)
		{
		case 'a':
			
			break;
		case 's':
			results=leftvals-rightvals;
			break;
		case 'd':
			results=rightvals!=0.0d?leftvals/rightvals:0.0d;
			break;
		case 'm':
			results=leftvals*rightvals;
			break;
			default:
				System.out.println("error");
				results=0.0d;
		}
	}
	
}
