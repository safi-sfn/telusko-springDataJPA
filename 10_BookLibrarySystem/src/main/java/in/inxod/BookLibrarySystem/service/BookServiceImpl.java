package in.inxod.BookLibrarySystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.inxod.BookLibrarySystem.model.Book;
import in.inxod.BookLibrarySystem.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	
	private BookRepository repo;
	
	@Autowired
	public void setRepo(BookRepository repo) {
		this.repo = repo;
	}

	
	// Add Single Book
	@Override
	public Book addSingleBook(Book book) {
		return repo.save(book);
	}

	// Add Multiple Book
	@Override
	public Iterable<Book> addMultipleBook(Iterable<Book> book) {	
		return repo.saveAll(book);
	}
	
	
	// Show all Book
	@Override
	public Iterable<Book> getAllBook() {
		return repo.findAll();
	}

	// Show Book by author
	@Override
	public Iterable<Book> getByAuthor(String author) {
		Iterable<Book> book = repo.findByAuthor(author);
		return book;
	}

	// get All books price less than given value
	@Override
	public List<Book> findAllBookByPriceLessThan(Double price) {
		List<Book> books = repo.findAllByPriceLessThan(price);
		
		return books;
	}
	
	
	
	// Delete by Id
	@Override
	public String deleteById(Integer id) {
		Optional<Book> optional = repo.findById(id);
		if(optional.isPresent()) {
			repo.deleteById(id);
			return "Book deleted";
		}
		return "Book Not Found with this Id : "+id;
	}



	// update book price
	@Override
	public String updateBookPrice(Double price, Integer id) {
		Optional<Book> optional = repo.findById(id);
		if(optional.isPresent()) {
			Book presentBook = optional.get();
			presentBook.setPrice(price);
			repo.save(presentBook);
			return "Price updated";
		}
		return "Book Not found";
	}

}
