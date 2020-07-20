package com.example.sbjpah2v1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookServiceTest {
	
	@Autowired
	BookService bookService;

	@Test
	void createsInitialRecords() {
		assertEquals(bookService.getBooks().size(), 3);
	}

}
