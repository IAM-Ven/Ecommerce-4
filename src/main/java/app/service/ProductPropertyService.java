package app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.entity.ProductProperty;
import app.repository.ProductPropertyRepository;

@Service
public class ProductPropertyService
{
	@Autowired
	private ProductPropertyRepository productpropertyRepository;
	public void save(ProductProperty productproperty)
	{
		productpropertyRepository.save(productproperty);
	}
	public void update(ProductProperty productproperty)
	{
		productpropertyRepository.save(productproperty);
	}
	public void deleteById(int id)
	{
		productpropertyRepository.deleteById(id);
	}
	public ProductProperty findById(int id)
	{
		return productpropertyRepository.findById(id).orElse(null);
	}
	public List<ProductProperty> findAll()
	{
		return productpropertyRepository.findAll();
	}
}