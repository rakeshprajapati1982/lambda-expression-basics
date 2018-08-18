package com.readtorakesh.java8.lambda_expression_basics;

public class MainApp {
	public static void main(String[] args) {
		new MainApp().doMain();
	}
	
	private void doMain() {
		System.out.println("# Lambda - Double the value: 10");
		System.out.println(processValue(10, n -> n * 2));
		
		System.out.println("\n");
		
		System.out.println("# Anonymous Inner Class - Double the value: 10");
		System.out.println(processValue(10, new Processor() {
			@Override
			public int process(int input) {
				return input * 2;
			}
		}));
	}
	
	private int processValue(int value, Processor processor) {
		return processor.process(value);
	}
}
