package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import app.entity.CategoryProperty;
import app.service.CategoryPropertyService;

@RestController
@RequestMapping("/categoryproperty")
public class CategoryPropertyController
{
	@Autowired
	private CategoryPropertyService categorypropertyService;
	@GetMapping
	public List<CategoryProperty> findAll()
	{
		return categorypropertyService.findAll();
	}
	@GetMapping("/{id}")
	public CategoryProperty findById(@PathVariable int id)
	{
		return categorypropertyService.findById(id);
	}
	@PostMapping
	public CategoryProperty save(@RequestBody CategoryProperty categoryproperty)
	{
		categorypropertyService.save(categoryproperty);
		return categoryproperty;
	}
	@PutMapping
	public void update(@RequestBody CategoryProperty categoryproperty)
	{
		categorypropertyService.update(categoryproperty);
	}
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id)
	{
		categorypropertyService.deleteById(id);
	}
}