package shop.cofin.oracle.book.model;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.cofin.oracle.book.model.BookDto;
import shop.cofin.oracle.common.service.GenericInterface;


@Component
public interface BookService extends GenericInterface<BookDto, Integer>{

	List<BookDto> findByBookTitle(String bookTitle);

	List<BookDto> findByPrice(int price);

	List<BookDto> findByPubId(int pubId);

	
}
