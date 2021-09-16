package shop.cofin.oracle.customer.web;

import java.util.Arrays;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.cofin.oracle.book.model.BookDto;
import shop.cofin.oracle.book.model.BookService;
import shop.cofin.oracle.common.GenericInterface;
import shop.cofin.oracle.customer.model.CustomerDto;
import shop.cofin.oracle.customer.model.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomerController{
	
	@Autowired CustomerService customerService;

	@RequestMapping(value = "/register", method = {RequestMethod.POST})
	public void save(CustomerDto customer) {
		
		customerService.save(customer);
		
	}

	@RequestMapping("/detail")
	public CustomerDto findById(@RequestParam Integer custId) {
		CustomerDto customers = customerService.findById(custId);
			System.out.println(customers.toString());
		return customerService.findById(custId);
	}

	@RequestMapping("/list")
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

	@RequestMapping("/delete")
	public void delete(@RequestParam Integer custId) {
		customerService.delete(custId);
		
	}
	
	@RequestMapping(value = "/login", method = {RequestMethod.POST})
	public String Login() {
		return null;
	}
	
}
	

