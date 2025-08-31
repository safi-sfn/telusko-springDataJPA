package in.inxod.BookLibrarySystem;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.inxod.BookLibrarySystem.model.Book;
import in.inxod.BookLibrarySystem.service.BookServiceImpl;

@SpringBootApplication
public class BookLibrarySystemApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(BookLibrarySystemApplication.class, args);
		
		BookServiceImpl service = container.getBean(BookServiceImpl.class);
		
		// Add Single book
/*		
		Book book = new Book();
		book.setTitle("The Alchemist");
		book.setAuthor("Paulo Coelho");
		book.setPrice(350.00);
		book.setGenre("Fiction");
		service.addSingleBook(book);
*/		
/*		
		List<Book> books = new ArrayList<>();


		books.add(new Book("Shutter Island", "Dennis Lehane", 550.0, "Thriller"));
		books.add(new Book("To Kill a Mockingbird", "Harper Lee", 500.0, "Fiction"));
		books.add(new Book("The Pragmatic Programmer", "Andrew Hunt", 850.0, "Programming"));
		books.add(new Book("The Kite Runner", "Khaled Hosseini", 600.0, "Fiction"));
		books.add(new Book("The Selfish Gene", "Richard Dawkins", 700.0, "Science"));
		books.add(new Book("Cosmos", "Carl Sagan", 750.0, "Science"));
		books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 450.0, "Fiction"));
		
		
		service.addMultipleBook(books);
		System.out.println("Book Added successfully");
*/	

/*
		// Show All Book 
		
		Iterable<Book> books = service.getAllBook();
		for (Book book : books) {
			System.out.println(book.getTitle());
		}
*/	
		
		// Find by Author
/*
		
		// if multiple author then we use List and also receive as List
//		List<String> author = new ArrayList<>();
//		author.add("Andrew Hunt");
//		author.add("Richard Dawkins");
		
		String author = "Siddhartha Mukherjee";
		Iterable<Book> books = service.getByAuthor(author);
		for (Book book : books) {
			System.out.println("Id  : "+book.getBookId());
			System.out.println("Title : "+book.getTitle());
			System.out.println("Price : "+book.getPrice());
			System.out.println("Genre : "+book.getGenre());
			
		}
*/	
		
		
	   // Delete By Id	
//		int id = 62;
//		String status = service.deleteById(id);
//		System.out.println(status);
		
		
		// Find By PriceLess Than
/*	
		Double price = 500.0;
		List<Book> books = service.findAllBookByPriceLessThan(price);
		books.forEach(b -> 
	    System.out.println(b.getTitle() + " | " + b.getAuthor() + " | " + b.getPrice()) );
*/
		
		// Update book price
/*		
		int id=67;
		double newPrice = 699.0;
		String updateStatus = service.updateBookPrice(newPrice, id);
		System.out.println(updateStatus);
*/
		
	}

}














