package com.cpg.lab7.exercise5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsSecondSmallest {
	public static int getSecondSmallest(Integer[] a) {
		List<Integer> list=Arrays.asList(a);
		Collections.sort(list);
		int element=list.get(1);
		return element;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[]= {464,23,234,56};
		System.out.println("Ans:"+getSecondSmallest(a));
	}

}