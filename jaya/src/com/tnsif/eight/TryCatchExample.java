package com.tnsif.eight;

public class TryCatchExample 
 {	
		public static void main(String[] args) {
				int[] a=new int[5];
				try 
				{
					System.out.println(a[5]);
				}
				catch(Exception e) {
					System.out.println("This is try catch example");
				}

	}

}
