package org.mywork.java.demo;

public class MyIncDecWithTiming extends MyIncDec {
	
	public MyIncDecWithTiming(int x) {
		super(x);	
	}

	public static void main(String[] args) {
		MyIncDec obj = new MyIncDec(5);
		obj.decrement();
	}
/*
 * Other way to avoid the cluttering of the code and polluting everywhere we can use the combination of Annotation Interface and Aspect oriented 
 * programming
 */
}
