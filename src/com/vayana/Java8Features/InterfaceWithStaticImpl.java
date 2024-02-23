package com.vayana.Java8Features;

public class InterfaceWithStaticImpl implements StaticDemo {

	
	//Java interface static method is similar to default method except that we can’t override them in 
	//the implementation classes. This feature helps us in avoiding undesired results incase of poor
	//implementation in implementation classes.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//InterfaceWithStaticImpl interfaceWithStaticImpl=new InterfaceWithStaticImpl();
		//interfaceWithStaticImpl.staticMethod();
		
		StaticDemo.staticMethod();
		
		
		
	}

}
