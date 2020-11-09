package com.boyuanshi.java;

public class OOPexercise {
	public static void main(String[] args) {
		OOPexercise exer1 = new OOPexercise();
		exer1.method();
	}
	
	public void method() {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 8; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
