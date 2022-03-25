package com.example.demo.runner;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.Book;
import com.example.demo.repository.IBookRepository;
@Component
public class TestRunner implements  CommandLineRunner {
	 @Autowired
	  private IBookRepository repo;
	@Override
	
	public void run(String... args) throws Exception {
	   List<Book> l=repo.GetBook();
		Iterator<Book>a= l.listIterator();
//		while (a.hasNext()) 
//				System.out.println((Book)a.next());	
//	
		
	Book L=repo.getByCondition();
   System.out.println(L);
		
		
	}

}
