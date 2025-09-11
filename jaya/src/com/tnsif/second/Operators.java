package com.tnsif.second;

public class Operators  {
		    public static void main(String[] args) {
		        
		        int a = 10, b = 5;

		        // 1. Arithmetic Operators
		        System.out.println("=== Arithmetic Operators ===");
		        System.out.println("a + b = " + (a + b));  
		        System.out.println("a - b = " + (a - b));  
		        System.out.println("a * b = " + (a * b));  
		        System.out.println("a / b = " + (a / b));  
		        System.out.println("a % b = " + (a % b));  

		        // 2. Relational Operators
		        System.out.println("\n=== Relational Operators ===");
		        System.out.println("a == b: " + (a == b)); 
		        System.out.println("a != b: " + (a != b)); 
		        System.out.println("a > b: " + (a > b));   
		        System.out.println("a < b: " + (a < b));   
		        System.out.println("a >= b: " + (a >= b)); 
		        System.out.println("a <= b: " + (a <= b)); 

		        // 3. Logical Operators
		        System.out.println("\n=== Logical Operators ===");
		        System.out.println("(a > 5 && b < 10): " + (a > 5 && b < 10)); 
		        System.out.println("(a > 5 || b > 10): " + (a > 5 || b > 10)); 
		        System.out.println("!(a > b): " + !(a > b));                   

		        // 4. Assignment Operators
		        System.out.println("\n=== Assignment Operators ===");
		        int x = 20;
		        System.out.println("x = " + x);
		        x += 5; 
		        System.out.println("x += 5 -> " + x);
		        x -= 3;
		        System.out.println("x -= 3 -> " + x);
		        x *= 2;
		        System.out.println("x *= 2 -> " + x);
		        x /= 4;
		        System.out.println("x /= 4 -> " + x);
		        x %= 3;
		        System.out.println("x %= 3 -> " + x);

		        // 5. Unary Operator
		        System.out.println("\n=== Unary Operators ===");
		        int y = 7;
		        System.out.println("y = " + y);
		        System.out.println("y++ = " + (y++)); 
		        System.out.println("After y++: " + y);
		        System.out.println("++y = " + (++y)); 
		        System.out.println("y-- = " + (y--)); 
		        System.out.println("After y--: " + y);
		        System.out.println("--y = " + (--y)); 
		        System.out.println("Unary minus of y: " + (-y));

		        
		        System.out.println("\n=== Ternary Operator ===");
		        String result = (a > b) ? "a is greater" : "b is greater or equal";
		        System.out.println("Result: " + result);

		        
		        System.out.println("\n=== Bitwise Operators ===");
		        int p = 6, q = 3; 
		        System.out.println("p & q = " + (p & q));  
		        System.out.println("p | q = " + (p | q));  
		        System.out.println("p ^ q = " + (p ^ q));  
		        System.out.println("~p = " + (~p));        

		        
		        System.out.println("\n=== Shift Operators ===");
		        int num = 8;
		        System.out.println("num << 1 = " + (num << 1)); 
		        System.out.println("num >> 1 = " + (num >> 1)); 
		        System.out.println("num >>> 1 = " + (num >>> 1)); 
		    }
		}