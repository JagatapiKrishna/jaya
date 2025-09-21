package com.tnsif.seven;

public class StringBuilderBuffer {
	public static void main(String[] args) {
	System.out.println("StringBuffer Operations");
    StringBuffer sbf = new StringBuffer("Hello");
    
    sbf.append(" World");  
    System.out.println("Append: " + sbf);
    
    sbf.insert(5, ",");     
    System.out.println("Insert: " + sbf);
    
    sbf.replace(0, 5, "Hi"); 
    System.out.println("Replace: " + sbf);
    
    sbf.delete(2, 3);       
    System.out.println("Delete: " + sbf);
    
    sbf.reverse();          
    System.out.println("Reverse: " + sbf);
    
    System.out.println("Capacity: " + sbf.capacity()); // Buffer size
    System.out.println("Length: " + sbf.length());
    
    System.out.println("\nStringBuilder Operations");
    StringBuilder sbd = new StringBuilder("Java");

    sbd.append(" Programming");
    System.out.println("Append: " + sbd);

    sbd.insert(4, " Language");
    System.out.println("Insert: " + sbd);

    sbd.replace(0, 4, "C++");
    System.out.println("Replace: " + sbd);

    sbd.delete(3, 12);
    System.out.println("Delete: " + sbd);

    sbd.reverse();
    System.out.println("Reverse: " + sbd);

    System.out.println("Capacity: " + sbd.capacity());
    System.out.println("Length: " + sbd.length());
	}
}
