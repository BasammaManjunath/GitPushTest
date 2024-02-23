package com.vayana.Java8Features;

public class MethodReferenceDemo {

	//Method Interface is a replacement of lambda expression.its used to refer a method of Functional Interface
	//to an existing method
	//Functional Interface abstract method can be mapped to an existing method using :: operator.This is a method reference
	//Hence Method reference is an alternative for lambda expression
	public static void main(String[] args) {
       FunctionalInterFaceDemo fe1=Test :: testImplementation;
       fe1.singleAbstractMethod();
       
       FunctionalInterFaceDemo demo=()->System.out.println("Demo Can be given");
       demo.singleAbstractMethod();
       }

}


class Test{
	
	public static void testImplementation() {
		System.out.println("This is the test implementation of your abstract method");
	}
}