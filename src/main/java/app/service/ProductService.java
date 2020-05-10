package app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.entity.Product;
import app.repository.ProductRepository;

@Service
public class ProductService
{
	@Autowired
	private ProductRepository productRepository;
	public void save(Product product)
	{
		productRepository.save(product);
	}
	public void update(Product product)
	{
		productRepository.save(product);
	}
	public void deleteById(int id)
	{
		productRepository.deleteById(id);
	}
	public Product findById(int id)
	{
		return productRepository.findById(id).orElse(null);
	}
	public List<Product> findAll()
	{
		return productRepository.findAll();
	}
}