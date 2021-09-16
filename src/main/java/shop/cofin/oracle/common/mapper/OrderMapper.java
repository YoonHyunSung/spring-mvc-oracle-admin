package shop.cofin.oracle.common.mapper;

import org.springframework.stereotype.Repository;

import shop.cofin.oracle.common.service.GenericInterface;
import shop.cofin.oracle.order.model.OrderDto;

@Repository
public interface OrderMapper extends GenericInterface<OrderDto, Integer>{
	

}
