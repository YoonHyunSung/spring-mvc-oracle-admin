package shop.cofin.oracle.mappers;

import org.springframework.stereotype.Repository;

import shop.cofin.oracle.common.GenericInterface;
import shop.cofin.oracle.publisher.domain.PublisherDto;

@Repository
public interface PublisherMapper extends GenericInterface<PublisherDto, Integer> {

}
