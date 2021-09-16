package shop.cofin.oracle.common.mapper;

import org.springframework.stereotype.Repository;

import shop.cofin.oracle.common.service.GenericInterface;
import shop.cofin.oracle.customer.model.CustomerDto;

@Repository
public interface CustomerMapper	extends GenericInterface<CustomerDto, Integer> {


}
