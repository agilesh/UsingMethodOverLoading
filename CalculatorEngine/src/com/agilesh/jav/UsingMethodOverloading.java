package com.agilesh.jav;

public class UsingMethodOverloading {


	public static void main(String args[])
	{
		
			
		MathEquation[] equations  = new MathEquation[4];
		equations[0]= new MathEquation('d',100.0d,50.0d);
		equations[1]= new MathEquation('a',25.0d,92.0d);
		equations[2]= new MathEquation('s',225.0d,17.0d);
		equations[3]= new MathEquation('m',11.0d,3.0d);
		
		for(MathEquation eqn:equations)
		{
			eqn.execute();
			System.out.println("results =");
			System.out.println(eqn.getResults());
		}
		
		
		System.out.println();
		System.out.println("using overload");
		System.out.println();
		
		double leftDouble = 9.0d;
		double rightDouble =4.0d;
		
		int leftint =9;
		int rightint =4;
		
		MathEquation eqnoverload = new MathEquation('d');
		eqnoverload.execute(leftDouble,rightDouble);
		System.out.println("result");
		System.out.println(eqnoverload.getResults());
		
		
		
		eqnoverload.execute(leftint,rightint);
		System.out.println("result");
		System.out.println(eqnoverload.getResults());
		
		
		eqnoverload.execute((double)leftint,rightint);
		System.out.println("result");
		System.out.println(eqnoverload.getResults());
		
	}
	
}