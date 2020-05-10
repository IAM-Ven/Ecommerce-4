package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import app.entity.Category;
import app.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController
{
	@Autowired
	private CategoryService categoryService;
	@GetMapping
	public List<Category> findAll()
	{
		return categoryService.findAll();
	}
	@GetMapping("/{id}")
	public Category findById(@PathVariable int id)
	{
		return categoryService.findById(id);
	}
	@PostMapping
	public Category save(@RequestBody Category category)
	{
		categoryService.save(category);
		return category;
	}
	@PutMapping
	public void update(@RequestBody Category category)
	{
		categoryService.update(category);
	}
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id)
	{
		categoryService.deleteById(id);
	}
}