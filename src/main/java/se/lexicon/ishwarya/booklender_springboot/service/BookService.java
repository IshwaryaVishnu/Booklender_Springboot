package se.lexicon.ishwarya.booklender_springboot.service;
import se.lexicon.ishwarya.booklender_springboot.dto.BookDto;

import java.util.List;

public interface BookService {

    List<BookDto> findByReserved(boolean reserved);
    List<BookDto> findByAvailable(boolean available);
    List<BookDto> findByBookTitle(String title);
    BookDto findById(Integer bookId);
    List<BookDto> findAll();
    BookDto create(BookDto bookDto);
    BookDto update(BookDto bookDto);
    Boolean delete(Integer bookId);
}
