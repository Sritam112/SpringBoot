package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.Book;
import com.example.demo.repository.IBookRepository;
@Component
public class InsertRunner implements CommandLineRunner {
  @Autowired
  private IBookRepository repo;
	@Override
	public void run(String... args) throws Exception {
		repo.save(new Book(1011, "Core Java","SAM", "Backend", 500.0));
		repo.save(new Book(1012, "Adv Java","SYED", "Backend", 600.0));
		repo.save(new Book(1013, "Hibernate","RAM", "Backend", 700.0));
		repo.save(new Book(1014, "BOOT AND MS","SYED", "Backend", 800.0));
		repo.save(new Book(1015, "Angular","SAM", "Frontend", 500.0));
		repo.save(new Book(1016, "Bootstrap","SYED", "Frontend", 600.0));
		repo.save(new Book(1017, "HTML and CSS","RAM", "Frontend", 400.0));
		repo.save(new Book(1018, "JQuery",null, "Frontend", 400.0));
		repo.save(new Book(1019, "Tool",null, "Backend", 200.0));
		
	}

}
