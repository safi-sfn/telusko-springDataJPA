package in.inxod.BookLibrarySystem.service;

import java.util.List;

import in.inxod.BookLibrarySystem.model.Book;

public interface BookService {

	// ========== CREATE OPERATIONS ==========
	Book addSingleBook(Book book);
	Iterable<Book> addMultipleBook(Iterable<Book> book);

	// ========== READ OPERATIONS ==========
	Iterable<Book> getAllBook();
	Iterable<Book> getByAuthor(String author);
	List<Book> findAllBookByPriceLessThan(Double price);

	// ========== UPDATE OPERATION ==========
	String updateBookPrice(Double price, Integer id);
	
	// ========== DELETE OPERATIONS ==========
	String deleteById(Integer id);

	
}
