package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import app.entity.ProductImage;
import app.service.ProductImageService;

@RestController
@RequestMapping("/productimage")
public class ProductImageController
{
	@Autowired
	private ProductImageService productimageService;
	@GetMapping
	public List<ProductImage> findAll()
	{
		return productimageService.findAll();
	}
	@GetMapping("/{id}")
	public ProductImage findById(@PathVariable int id)
	{
		return productimageService.findById(id);
	}
	@PostMapping
	public ProductImage save(@RequestBody ProductImage productimage)
	{
		productimageService.save(productimage);
		return productimage;
	}
	@PutMapping
	public void update(@RequestBody ProductImage productimage)
	{
		productimageService.update(productimage);
	}
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id)
	{
		productimageService.deleteById(id);
	}
}