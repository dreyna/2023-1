package com.example.demo.service;

import java.util.List;
import java.util.Optional;


public interface GenericeService<T> {
	
	List<T> findByLike(T t) throws ServiceException;
	
	Optional<T> findById(Long id)throws ServiceException;

}
