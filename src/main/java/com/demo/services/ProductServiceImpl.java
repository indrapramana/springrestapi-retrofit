package com.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.entities.Product;
import com.demo.repositories.ProductRepository;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Iterable<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public Product find(String id) {
		return productRepository.findById(id).get();
	}

	@Override
	public void create(Product product) {
		productRepository.save(product);
	}

	@Override
	public void update(Product product) {
		productRepository.save(product);
	}

	@Override
	public void delete(String id) {
		productRepository.deleteById(id);
	}

}
