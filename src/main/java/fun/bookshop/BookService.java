package fun.bookshop;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
  private final BookRepository bookRepository;

  public BookService(BookRepository bookRepository) {

    this.bookRepository = bookRepository;
  }

  public List<Book> getAllBooks() {
    return bookRepository.findAll()
        .stream()
        .map(bookEntity -> new Book(bookEntity.name, "Paulo Coehlo"))
        .toList();

  }
}
