package com.epam.vvit;

import java.util.LinkedList;

public class CustomList_Implementation {
	public void Add(List<String> list,String item,int index) {
			list.add(index,item);
	}
	public void Delete(List<String> list, int item) {
		
		list.remove(item);
	}
	
	public void Delete_All(List<String> list) {
		// TODO Auto-generated method stub
		list.removeAll(list);
		
	}
	
}
