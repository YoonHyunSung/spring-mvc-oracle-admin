package shop.cofin.oracle.common.mapper;

import org.springframework.stereotype.Repository;

import shop.cofin.oracle.common.service.GenericInterface;
import shop.cofin.oracle.publisher.model.PublisherDto;

@Repository
public interface PublisherMapper extends GenericInterface<PublisherDto, Integer> {

}
