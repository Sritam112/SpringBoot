package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Book;

public interface IBookRepository extends JpaRepository<Book, Integer> {
	@Query("FROM Book B")
	public List<Book>GetBook();
	
	@Query("from Book b where b.bookId=1011")
	public Book getByCondition();

}
