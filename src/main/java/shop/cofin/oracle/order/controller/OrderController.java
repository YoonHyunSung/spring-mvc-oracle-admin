package shop.cofin.oracle.order.controller;

import java.sql.Date;
import java.util.List;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import oracle.sql.DATE;
import shop.cofin.oracle.common.GenericInterface;
import shop.cofin.oracle.order.domain.OrderDto;
import shop.cofin.oracle.order.service.OrderService;

@Controller
@RequestMapping("/orders")
public class OrderController{
	
	@Autowired OrderService orderService;

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public void save(OrderDto order) {
		orderService.save(order);
		
	}

	@Override
	public OrderDto findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(OrderDto t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}
	
}
