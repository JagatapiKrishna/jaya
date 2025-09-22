package com.tnsif.eight;

public class StringException {

	public static void main(String[] args)  {
		String str=null;
		try 
		{
			int len=str.length();
			System.out.println(len);
		}
		catch(Exception e){
			System.out.println("String can't be empty "+e);	
		}

	}
}

