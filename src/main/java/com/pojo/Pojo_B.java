package com.pojo;

public class Pojo_B {
	
	public static void main(String[] args) {
		
		Pojo_A obj  = new Pojo_A();
		
		int a = obj.getA();
		
		System.out.println("Before Setter : "  + a);
		
		obj.setA(500000);
		
		int b = obj.getA();
		
		System.out.println("After Setter : " +  b);
		
	}

}
