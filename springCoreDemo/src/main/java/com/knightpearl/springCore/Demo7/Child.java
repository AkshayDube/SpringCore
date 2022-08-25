package com.knightpearl.springCore.Demo7;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Child {

	private List<Integer> mobileNumbers;
	
	private Map<String,Integer> marks;
	
	private Set<Integer> rating;
	
	

	public Child(List<Integer> mobileNumbers, Map<String, Integer> marks, Set<Integer> rating) {
		super();
		this.mobileNumbers = mobileNumbers;
		this.marks = marks;
		this.rating = rating;
	}

	public List<Integer> getMobileNumbers() {
		return mobileNumbers;
	}

	public void setMobileNumbers(List<Integer> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}

	public Map<String,Integer> getMarks() {
		return marks;
	}

	public void setMarks(Map<String,Integer> marks) {
		this.marks = marks;
	}

	public Set<Integer> getRating() {
		return rating;
	}

	public void setRating(Set<Integer> rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Student [mobileNumbers=" + mobileNumbers + ", \nmarks=" + marks + ", \nrating=" + rating + "]";
	}
	
	
}
