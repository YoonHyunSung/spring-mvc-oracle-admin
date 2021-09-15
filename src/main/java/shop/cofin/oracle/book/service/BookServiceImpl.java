package shop.cofin.oracle.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.cofin.oracle.book.domain.BookDto;
import shop.cofin.oracle.mappers.BookMapper;

@Service
public class BookServiceImpl implements BookService {

	@Autowired BookMapper mapper;

	@Override
	public void save(BookDto t) {
		mapper.save(t);
		
	}

	@Override
	public BookDto findById(Integer id) {
		
		BookDto book = mapper.findById(id);
		return book;
	}

	@Override
	public List<BookDto> findAll() {
		
		return mapper.findAll();
	}

	@Override
	public void update(BookDto t) {
		mapper.update(t);
	}

	@Override
	public void delete(Integer id) {
		mapper.delete(id);
	}

	@Override
	public List<BookDto> findByBookTitle(String bookTitle) {
		
		return mapper.findByBookTitle(bookTitle);
	}

	@Override
	public List<BookDto> findByPrice(int price) {
		
		return mapper.findByPrice(price);
	}

	@Override
	public List<BookDto> findByPubId(int pubId) {
		// TODO Auto-generated method stub
		return mapper.findByPubId(pubId);
	}
	
	
	
	
}
