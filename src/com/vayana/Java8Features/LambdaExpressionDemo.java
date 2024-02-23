package com.vayana.Java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class LambdaExpressionDemo {

	public static void main(String[] args) {
		LambdaExpressionDemo lambdaExpressionDemo=new LambdaExpressionDemo();
		lambdaExpressionDemo.add(10,2);
		
		BiConsumer<Integer, Integer> biconsumer=(a,b)-> System.out.println(a+b);
		biconsumer.accept(12, 2);
		
		
	}

	public void add(int a,int b) {
 	   System.out.println(a+b);
    }
	
	
}
