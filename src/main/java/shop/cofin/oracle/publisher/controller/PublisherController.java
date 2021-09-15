package shop.cofin.oracle.publisher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


import shop.cofin.oracle.order.domain.OrderDto;
import shop.cofin.oracle.publisher.domain.PublisherDto;
import shop.cofin.oracle.publisher.service.PublisherService;

@Controller
public class PublisherController {
	@Autowired PublisherService publisherService;
	@Autowired PublisherDto publisher;

	public String save(PublisherDto publisher) {
		
		return null;
	}

	public Object findById(String id) {
		
		return null;
	}
	
	public List<?> findAll() {
		
		return null;
	}
	
	public String Update(Object o) {
		
		return null;
	}
	
	public String delete(String id) {
		
		return null;
	}
}