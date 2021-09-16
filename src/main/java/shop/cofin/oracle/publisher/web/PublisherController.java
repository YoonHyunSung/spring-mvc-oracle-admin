package shop.cofin.oracle.publisher.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import shop.cofin.oracle.publisher.model.PublisherDto;
import shop.cofin.oracle.publisher.model.PublisherService;

@Controller
@RequestMapping(value = "/publishers")
public class PublisherController {
	@Autowired PublisherService publisherService;
	@Autowired PublisherDto publisher;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public void save(PublisherDto publisher) {
		publisherService.save(publisher);
	}
	@RequestMapping(value = "/find/pubId")
	public PublisherDto findById(@RequestParam int pubId) {
		
		return publisherService.findById(pubId);
	}
	@RequestMapping(value = "/list")
	public List<PublisherDto> findAll() {
		List<PublisherDto> publishers = publisherService.findAll();
		for(PublisherDto publisher : publishers) {
			System.out.println(publisher.toString());
		}
		return null;
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(PublisherDto publisher) {
		
		return null;
	}
	
	public String delete(Integer pubId) {
		
		return null;
	}
}