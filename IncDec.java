package org.mywork.java.demo;

public interface IncDec {
	void increment();
	void decrement();
	default void printingTiming(long x) {
		System.out.println("this is default implimentation for not breaking earlier implimenation of interface");
	}
}
