package shop.cofin.oracle.order.web;

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
import shop.cofin.oracle.order.model.OrderDto;
import shop.cofin.oracle.order.model.OrderService;

@Controller
@RequestMapping("/orders")
public class OrderController{
	
	@Autowired OrderService orderService;

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public void save(OrderDto order) {
		orderService.save(order);
		
	}
	
	@RequestMapping("/find/orderId")
	public OrderDto findById(@RequestParam Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping("/list")
	public List<OrderDto> findAll() {

		return null;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public void update(OrderDto order) {
		
	}

	@RequestMapping("/delete")
	public void delete(@RequestParam Integer orderId) {

		
	}
	
}
