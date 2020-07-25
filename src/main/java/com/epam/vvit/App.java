package com.epam.vvit;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
    public static void main( String[] args )
    {	
    	List<String> list=new List<String>();
    	List<String> new_list = new List<String>();
    	Scanner scan = new Scanner(System.in);
    	final Logger logger=LogManager.getLogger(App.class);
    	list.add("Python");
    	list.add("Java");
    	list.add("C");
    	list.add("C++");
    	list.add("Perl");
    	list.add("Kotlin");
    	list.add("C#");
    	list.add("Swift");
    	list.add("Dart");
    	list.add("Ruby");
    	
    	CustomList_Implementation list_methods = new CustomList_Implementation();
    	
    	logger.info("Elements in the list are :"+" ");
    	Iterator<String> iterator=list.iterator();
    	while(iterator.hasNext()) {
    		logger.info(iterator.next()+", ");
    	}
    	
    	String ch;
    	
    	while(true) {
    		logger.info("Choose Operations:\n1. Add\n2. Delete\n3. Print\n4.Delete all elements in the list\n5.Exit");
    		ch = scan.next();
    		int k;
    		try {
    			 k = Integer.parseInt(ch);
    		
    		switch(k) {
    			case 1:
    				
	    				logger.info("Enter the element to be added:");
	    				String item = scan.next();
	    				try {
	    				logger.info("Enter the index at which the element is to be added");
	    				int index = scan.nextInt();
	    				list_methods.Add(list, item, index);
    				}
    				catch(Exception e) {
    					logger.error("space Exceeded");
    				}
	    			break;
    			case 2:
    				logger.info("Enter item_index to remove");
    				int item1 = scan.nextInt();
    				if(list.size()==0) {
    					logger.warn("List is empty!!");
    				}
				else{
					list_methods.Delete(list, item1);
				}
        				break;
    			case 3:
    				logger.info("Elements in the list are :");
    				for(String i:list) {
    					logger.info(i);
    				}
    				break;
    			case 4:
				list_methods.Delete_All(list);
				logger.info("List elements are deleted");
				break;
			case 5:
    				logger.info("Application closed");
    				return;
    			default: logger.error("choose a valid option");
    		}
    		}
    		catch(Exception e) {
    			logger.error("Choose an integer");
    		}
    	}
		
    	}
    }

	

