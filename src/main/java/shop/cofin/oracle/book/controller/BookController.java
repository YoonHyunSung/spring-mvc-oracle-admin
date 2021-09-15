package shop.cofin.oracle.book.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.cofin.oracle.book.domain.BookDto;
import shop.cofin.oracle.book.service.BookService;
import shop.cofin.oracle.common.GenericInterface;
import shop.cofin.oracle.customer.domain.CustomerDto;

@Controller
@RequestMapping(value = "/books")
public class BookController{

@Autowired BookService bookService;

@RequestMapping(value = "/register", method = {RequestMethod.POST})
public String save(BookDto book) {
	bookService.save(book);
	return "";
}

@RequestMapping(value = "/findById", method = RequestMethod.GET)
public BookDto findById(@RequestParam(name = "bookId") Integer bookId) {
	BookDto book = bookService.findById(bookId);
	System.out.println(book);
	return bookService.findById(bookId);
}

@RequestMapping(value = "/list", method = RequestMethod.POST)
public List<BookDto> findAll() {
	List<BookDto> books = bookService.findAll();
	for(BookDto book : books) {
		System.out.println(book.toString());
	}
	return bookService.findAll();
}

@RequestMapping(value = "/update", method = RequestMethod.POST )
public void update(BookDto book) {
	bookService.update(book);
}

@RequestMapping(value = "/delete", method = {RequestMethod.GET})
public void delete(@RequestParam(name = "bookId")Integer bookId) {
	bookService.delete(bookId);
	
}




	
	

	
}
