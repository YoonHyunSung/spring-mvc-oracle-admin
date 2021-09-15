package shop.cofin.oracle.mappers;

import org.springframework.stereotype.Repository;

import shop.cofin.oracle.common.GenericInterface;
import shop.cofin.oracle.customer.domain.CustomerDto;

@Repository
public interface CustomerMapper	extends GenericInterface<CustomerDto, Integer> {


}
