package com.cpg.lab7.exercise7;

import java.util.ArrayList;
import java.util.Arrays;
	import java.util.Collections;
	import java.util.List;

	public class CollectionsRevArrayDesc {
		public static ArrayList<Integer> getSecondSmallest(Integer[] a) {
			List<Integer> list=Arrays.asList(a);
			ArrayList<Integer> a1 = new ArrayList<Integer>();
			for(int i: list) {
				int reversed=0;
		        for(;i != 0; i /= 10) {
		            int digit = i % 10;
		            reversed = reversed * 10 + digit;
		            
		        }
		        a1.add(reversed);
			}
			Collections.sort(a1);
			return a1;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Integer a[]= {464,23,234,56};
			System.out.println("Ans:"+getSecondSmallest(a));
		}

	}