package shop.cofin.oracle.customer.controller;

import java.util.Arrays;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.cofin.oracle.book.domain.BookDto;
import shop.cofin.oracle.book.service.BookService;
import shop.cofin.oracle.common.GenericInterface;
import shop.cofin.oracle.customer.domain.CustomerDto;
import shop.cofin.oracle.customer.service.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomerController{
	
	@Autowired CustomerService customerService;

	@RequestMapping(value = "/register", method = {RequestMethod.POST})
	public void save(CustomerDto customer) {
		
		customerService.save(customer);
		
	}

	@RequestMapping(value = "/detail", method = {RequestMethod.GET})
	public CustomerDto findById(@RequestParam(name = "custId")Integer custId) {
		CustomerDto customers = customerService.findById(custId);
			System.out.println(customers.toString());
		return customerService.findById(custId);
	}

	@RequestMapping(value = "/list", method = {RequestMethod.POST})
	public List<CustomerDto> findAll() {
		System.out.println("findAll출력");
		List<CustomerDto> customers = customerService.findAll();
		for(CustomerDto customer : customers) {
			System.out.println(customer.toString());
		}
		return customerService.findAll();
	}

	@RequestMapping(value = "/update", method = {RequestMethod.POST})
	public void update(CustomerDto customer) {
		customerService.update(customer);
		
		
	}

	@RequestMapping(value = "/delete", method = {RequestMethod.GET})
	public void delete(@RequestParam(name ="custId") Integer custId) {
		customerService.delete(custId);
		
	}
	
	@RequestMapping(value = "/login", method = {RequestMethod.POST})
	public String Login() {
		return null;
	}
	
}
	

