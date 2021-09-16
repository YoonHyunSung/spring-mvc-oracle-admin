package shop.cofin.oracle.order.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import oracle.net.aso.m;
import shop.cofin.oracle.order.model.OrderMapper;
import shop.cofin.oracle.order.model.OrderDto;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired OrderMapper mapper;
	@Override
	
	public void save(OrderDto order) {
		// TODO Auto-generated method stub
		mapper.save(order);
		
	}
	@Override
	public OrderDto findById(Integer id) {
	
		return mapper.findById(id);
	}
	@Override
	public List<OrderDto> findAll() {
		// TODO Auto-generated method stub
		return mapper.findAll();
	}
	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		mapper.delete(id);
	}
	@Override
	public void update(OrderDto t) {
		// TODO Auto-generated method stub
		mapper.update(t);
	}

}
