package com.arya.bookappp;

import com.arya.bookapp.service.BookService;
import com.arya.bookapp.service.BookServiceImpl;

public class App {

	public static void main(String[] args) {
		int choice; 
		int index = 0;
		BookService service = new BookServiceImpl ();
		do {
			choice = service.printMenu();
			switch(choice) {
			case 1-> service.insertRecord(index++);	
			case 2-> service.updateRecord();
			case 3 -> service.deleteRecord();
			case 4 -> service.printRecord(index);
			case 5 -> service.printAllRecord();
			case 0 -> System.out.println("Exit... ");                        
			case 6 -> System.out.println("Invalid Input....");
			}
		}while(choice != 0);
	}
}
