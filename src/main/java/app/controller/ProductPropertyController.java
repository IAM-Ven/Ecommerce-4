package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import app.entity.ProductProperty;
import app.service.ProductPropertyService;

@RestController
@RequestMapping("/productproperty")
public class ProductPropertyController
{
	@Autowired
	private ProductPropertyService productpropertyService;
	@GetMapping
	public List<ProductProperty> findAll()
	{
		return productpropertyService.findAll();
	}
	@GetMapping("/{id}")
	public ProductProperty findById(@PathVariable int id)
	{
		return productpropertyService.findById(id);
	}
	@PostMapping
	public ProductProperty save(@RequestBody ProductProperty productproperty)
	{
		productpropertyService.save(productproperty);
		return productproperty;
	}
	@PutMapping
	public void update(@RequestBody ProductProperty productproperty)
	{
		productpropertyService.update(productproperty);
	}
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id)
	{
		productpropertyService.deleteById(id);
	}
}