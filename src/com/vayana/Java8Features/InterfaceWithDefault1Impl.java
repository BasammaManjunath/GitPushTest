package com.vayana.Java8Features;

public class InterfaceWithDefault1Impl implements DefaultDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceWithDefault1Impl impl1=new InterfaceWithDefault1Impl();
		impl1.test();

	}

	@Override
	public void printName() {
		System.out.println("primt name1");
		
	}

	
}
