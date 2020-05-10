package app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.entity.Category;
import app.repository.CategoryRepository;

@Service
public class CategoryService
{
	@Autowired
	private CategoryRepository categoryRepository;
	public void save(Category category)
	{
		categoryRepository.save(category);
	}
	public void update(Category category)
	{
		categoryRepository.save(category);
	}
	public void deleteById(int id)
	{
		categoryRepository.deleteById(id);
	}
	public Category findById(int id)
	{
		return categoryRepository.findById(id).orElse(null);
	}
	public List<Category> findAll()
	{
		return categoryRepository.findAll();
	}
}