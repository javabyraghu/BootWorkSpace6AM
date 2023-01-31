package com.app.raghu.repo;

import org.springframework.data.repository.CrudRepository;

import com.app.raghu.entity.Book;

public interface BookRepository 
	extends CrudRepository<Book, Integer>{

}
