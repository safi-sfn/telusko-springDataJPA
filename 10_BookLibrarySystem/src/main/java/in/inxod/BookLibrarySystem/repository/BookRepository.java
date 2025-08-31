package in.inxod.BookLibrarySystem.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import in.inxod.BookLibrarySystem.model.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

	// Custom finder Method
		Iterable<Book> findByAuthor(String author);
		
		List<Book> findAllByPriceLessThan(Double price);
		
		
	
}
