package com.example.stack.problems;

import java.util.StringTokenizer;

public class EvaluateInfixExpression {
	
	public String evaluateInfix(String expression)
	{
		expression = expression.replaceAll("\\s+","");
		String resultStr = "";
		MyGenericStack<String> newStack = new MyGenericStack<String>(expression.length());
		StringTokenizer strTokenize = new StringTokenizer(expression,"{}()*+-/",true);
		
		
			while(strTokenize.hasMoreTokens())
			{
				String token = strTokenize.nextToken();
				if(token.equals("(") || token.equals("{")|| token.equals("[0-9]+")||token.equals("*")||token.equals("/") || token.equals("+") || token.equals("-")){
					newStack.push(token);
				}
				else if(token.equals("}") || token.equals(")"))
				{
					try{
						
					int operant2 = Integer.parseInt(newStack.pop());
					String operand = newStack.pop();
					int operant1 = Integer.parseInt(newStack.pop());
					if(!newStack.isStackEmpty()){
	                        newStack.pop();
	                }
					int result = 0;
					if(operand.equals("*")){
						result = operant1*operant2;
					}
					else if(operand.equals("+")){
						result = operant1+operant2;
					}
					else if(operand.equals("/")){
						result = operant1/operant2;
					}
					else if(operand.equals("-")){
						result = operant1-operant2;
					}
					newStack.push(result+"");
					}
					catch(Exception e)
					{
						e.printStackTrace();
						
					}
				}			
		}
		
		
		try
		{
			resultStr = newStack.pop();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
		return resultStr;
	}
	
	public static void main(String[] args)
	{
		EvaluateInfixExpression obj = new EvaluateInfixExpression();
		System.out.println("((2*5)+(6/2)) :\t"+obj.evaluateInfix("((2*5)+(6/2))"));
	}

}

