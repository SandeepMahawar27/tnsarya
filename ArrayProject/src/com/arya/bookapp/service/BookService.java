package com.arya.bookapp.service;

public interface BookService {

	int printMenu();
	
	void insertRecord(int index);
	
	void deleteRecord();

	void printRecord(int id);
	
	void printAllRecord();

	void updateRecord();
}
