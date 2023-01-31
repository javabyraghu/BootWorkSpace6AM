package com.app.raghu.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.app.raghu.entity.Book;

public interface BookRepository 
	extends PagingAndSortingRepository<Book, Integer> {

}
