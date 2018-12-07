package com.qa.Luke.Montgomery.DeadPresidents;

import java.util.ArrayList;
import java.util.Arrays;

public class SortingList {
	
	public void sortList(ArrayList<String> list) {
		
		for (String string : list) {
			
			string = string.replaceAll("\t", " ");
			
			
			President one = new President(string.split(","));
			
			System.out.println(one);
			//System.out.println(one.dateOfBirth);
			
		}
		
	}
	
	
	
	
	
}
