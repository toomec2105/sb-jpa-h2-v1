package com.example.sbjpah2v1;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	@Autowired
	BookRepository bookRepository;

	public List<Book> getBooks() {
		return bookRepository.findAll();
	}

}
