package shop.cofin.oracle.common;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

public interface GenericInterface<T, U> {
	
	void save(T t);
	T findById(U id);
	List<T> findAll();
	void update(T t);
	void delete(U id);
}
