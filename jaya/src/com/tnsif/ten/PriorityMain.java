package com.tnsif.ten;

public class PriorityMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stubpackage com.tnsif.multithreading;
		PriorityDemo p1=new PriorityDemo();
		PriorityDemo p2=new PriorityDemo();
		p1.setPriority(1);
		p2.setPriority(10);
		p1.start();
		p2.start();	
	}

	}


