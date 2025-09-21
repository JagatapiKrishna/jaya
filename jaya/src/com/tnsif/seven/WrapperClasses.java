package com.tnsif.seven;

public class WrapperClasses {
	public static void main(String[] args) {
		byte b = 5;
		short s = 123;
		int i = 34567;
		long l = 12345678L;
		float f = 123.44F;
		double d = 1234567.890;
		char c = 'A';
		boolean g = true;
		
		Byte obj1 = Byte.valueOf(b);
		Short obj2 = s;
		Integer obj3 = i;
		Long obj4 = l;
		Float obj5 = f;
		Double obj6 = d;
		Character obj7 = c;
		Boolean obj8 = g; 
		
		System.out.println("Wrapper Objects(BOXING):");
		System.out.println("Byte object: " + obj1);
		System.out.println("Short object: " + obj2);
		System.out.println("Integer object: " + obj3);
	    System.out.println("Long object: " + obj4);
	    System.out.println("Float object: " + obj5);
	    System.out.println("Double object: " + obj6);
	    System.out.println("Character object: " + obj7);
	    System.out.println("Boolean object: " + obj8);
	    
	    byte b1 = obj1;
	    short s1 = obj2;
	    int i1 = obj3;
	    long l1 = obj4;
	    float f1 = obj5;
	    double d1 = obj6;
	    char c1 = obj7;
	    boolean g1 = obj8;
	    
	    System.out.println();
	    System.out.println("Unboxed Wrapper Objects(UNBOXING):");
		System.out.println("Byte: " + b1);
		System.out.println("Short: " + s1);
		System.out.println("Integer: " + i1);
	    System.out.println("Long: " + l1);
	    System.out.println("Float: " + f1);
	    System.out.println("Double: " + d1);
	    System.out.println("Character: " + c1);
	    System.out.println("Boolean: " + g1);
	}
}
