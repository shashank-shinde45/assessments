package org.mywork.java.demo;

public class MyIncDec implements IncDec {
	private int x;

	public MyIncDec(int x) {
		System.out.println("setting value to "+x);
		this.x = x;
	}
	@Override
	public void increment() {
	
		long startTime = System.currentTimeMillis();
		this.x++;
		printingTiming( System.currentTimeMillis()- startTime);
	}
	@Override
	public void decrement() {
		
		long startTime = System.currentTimeMillis();
		this.x--;
		
		printingTiming(System.currentTimeMillis()- startTime);
	}
	
	@Override
	public void printingTiming(long duration) {
		
		System.out.println("Time Taken for inovocation of method :"+duration);
	}
	

}
