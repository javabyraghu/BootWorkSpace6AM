package com.app.raghu.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.raghu.entity.Book;

public interface BookRepository 
	extends JpaRepository<Book, Integer> {

	//CASE#1 FETCHING ALL COLUMNS DATA
	//@Query("SELECT B FROM com.app.raghu.entity.Book B")
	//@Query("SELECT B FROM Book B") //package name is optional
	@Query("FROM Book") //short format = starts at FROM + Alias is optional
	public List<Book> getAllBooks();
	
	@Query("SELECT B.bookName FROM Book B")
	//@Query("SELECT bookName FROM Book")
	public List<String> getAllBookNames();
	
	@Query("SELECT B.bookName, B.bookCost FROM Book B")
	public List<Object[]> getNameAndCost();
	
	
	//---------Query with Parameters----------------------
	
	@Query("SELECT B FROM Book B WHERE B.bookName=?1 OR B.bookCost=?2") 
	public List<Book> getDataA(String bname, Double bcost );
	
	@Query("SELECT B FROM Book B WHERE B.bookName=:bname OR B.bookCost=:bcost") 
	public List<Book> getDataB(String bname, Double bcost );
	
	@Query("SELECT B.bookName FROM Book B WHERE B.bookAuthor=:auth")
	public List<String> getDataC(String auth);
	
	//----------------------------------------------------------
	@Query("SELECT B.bookType, COUNT(B.bookType) FROM Book B GROUP BY B.bookType HAVING B.bookType!=:name") 
	public List<Object[]> getDataD(String name);
	
	@Query("SELECT MIN(B.bookCost), MAX(B.bookCost), AVG(B.bookCost) FROM Book B WHERE B.bookAuthor=?1")
	public List<Object[]> getDataE(String bookAuth);
}
