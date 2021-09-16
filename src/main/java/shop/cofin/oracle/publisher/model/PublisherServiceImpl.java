package shop.cofin.oracle.publisher.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.cofin.oracle.publisher.model.PublisherMapper;
import shop.cofin.oracle.publisher.model.PublisherDto;

@Service
public class PublisherServiceImpl implements PublisherService {
	@Autowired PublisherMapper mapper;
	
	
	@Override
	public void save(PublisherDto publisher) {
		mapper.save(publisher);
		
	}

	@Override
	public PublisherDto findById(Integer pubId) {
	
		return mapper.findById(pubId);
	}

	@Override
	public List<PublisherDto> findAll() {
		
		return mapper.findAll();
	}

	@Override
	public void update(PublisherDto publisher) {
		// TODO Auto-generated method stub
		mapper.update(publisher);
	}

	@Override
	public void delete(Integer pubId) {
		// TODO Auto-generated method stub
		mapper.delete(pubId);
	}

}
