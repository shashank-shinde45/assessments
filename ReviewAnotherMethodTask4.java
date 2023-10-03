package org.mywork.java.demo;

import java.util.ArrayList;
import java.util.LinkedList;

public class ReviewAnotherMethodTask4 {

	public ReviewAnotherMethodTask4() {
		// TODO Auto-generated constructor stub
	}

	// we should generalized return type instead of raw type
	public LinkedList<T> findInsurerForPolicy(Policy p, boolan debug)
	{
		//Below we need to declare the reference variable of type list and assign concrete implementation when required.
		ArrayList l = new ArrayList();//can be delayed creation of object till we get something to store in it like at point 1.
		ArrayList list = getAllPolicies();
		for(int i=0;i<list.size();i++) {
			Insurer insurer = (Insurer) list.get(0);// need to pass the iterator counter variable instead of only first element
			boolean found = false;
			if(insurer.getPolicies().size() >0) {
				for (int j=0;j<=getPolicies().size(),j++)// need opening parenthesis as there are two statement in the logical block
					
					Policy p2 = insurer.getPolicies().get(j);
						found = (p2==p1);// need to make sure object are equal by therir properties and not by reference, we can use equal m
						//equal method here after overriding policy equal method.
				}
				if(found && insurer != null)
				l.add(insurer); //1. here we can add logic to add element to existing list or create list and add it 
			}
		}return new LinkedList(l);
}
// General review comment
	Provide proper names to reference variable specifying the business name and java type data it holds
	collection should be declared with proper declaration 

}
