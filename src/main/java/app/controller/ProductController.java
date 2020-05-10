package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import app.entity.Product;
import app.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController
{
	@Autowired
	private ProductService productService;
	@GetMapping
	public List<Product> findAll()
	{
		return productService.findAll();
	}
	@GetMapping("/{id}")
	public Product findById(@PathVariable int id)
	{
		return productService.findById(id);
	}
	@PostMapping
	public Product save(@RequestBody Product product)
	{
		productService.save(product);
		return product;
	}
	@PutMapping
	public void update(@RequestBody Product product)
	{
		productService.update(product);
	}
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id)
	{
		productService.deleteById(id);
	}
}