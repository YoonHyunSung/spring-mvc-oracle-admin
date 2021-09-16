package shop.cofin.oracle.customer.model;

import org.springframework.stereotype.Component;

import shop.cofin.oracle.common.service.GenericInterface;
import shop.cofin.oracle.customer.model.CustomerDto;

@Component
public interface CustomerService extends GenericInterface<CustomerDto, Integer> {
	
	

}
