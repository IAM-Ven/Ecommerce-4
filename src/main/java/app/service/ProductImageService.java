package app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.entity.ProductImage;
import app.repository.ProductImageRepository;

@Service
public class ProductImageService
{
	@Autowired
	private ProductImageRepository productimageRepository;
	public void save(ProductImage productimage)
	{
		productimageRepository.save(productimage);
	}
	public void update(ProductImage productimage)
	{
		productimageRepository.save(productimage);
	}
	public void deleteById(int id)
	{
		productimageRepository.deleteById(id);
	}
	public ProductImage findById(int id)
	{
		return productimageRepository.findById(id).orElse(null);
	}
	public List<ProductImage> findAll()
	{
		return productimageRepository.findAll();
	}
}