package org.mywork.java.demo;

public class ReviewMethodRecursion {

	public ReviewMethodRecursion() {
	}

	public static final Integer mulitply(Integer x, Integer y) {
		return (y == 0) ? 0: mulitply(x, y-1)+x;
	}
	public static void main(String[] args) {
		
		System.out.println(mulitply(5, 0));

	}
	
	//1. Should not use wrapper classes we can go with primitive if not required and null check 
	//is performed in advance
	//2. we can have simply check which is greater number and make it as  second argument y
	//3. ternary operation is better than if else so good performance contribution, good practice !

}
