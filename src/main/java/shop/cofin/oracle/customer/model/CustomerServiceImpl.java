package shop.cofin.oracle.customer.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.cofin.oracle.common.mapper.CustomerMapper;
import shop.cofin.oracle.customer.model.CustomerDto;


@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired CustomerMapper mapper;

	@Override
	public void save(CustomerDto t) {
		// TODO Auto-generated method stub
		mapper.save(t);
	}

	@Override
	public CustomerDto findById(Integer id) {
		// TODO Auto-generated method stub
		return mapper.findById(id);
	}

	@Override
	public List<CustomerDto> findAll() {
		
		return mapper.findAll();
	}

	@Override
	public void update(CustomerDto t) {
		mapper.update(t);
		
	}

	@Override
	public void delete(Integer id) {
		mapper.delete(id);
	}

	
}
