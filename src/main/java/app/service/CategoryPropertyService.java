package app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.entity.CategoryProperty;
import app.repository.CategoryPropertyRepository;

@Service
public class CategoryPropertyService
{
	@Autowired
	private CategoryPropertyRepository categorypropertyRepository;
	public void save(CategoryProperty categoryproperty)
	{
		categorypropertyRepository.save(categoryproperty);
	}
	public void update(CategoryProperty categoryproperty)
	{
		categorypropertyRepository.save(categoryproperty);
	}
	public void deleteById(int id)
	{
		categorypropertyRepository.deleteById(id);
	}
	public CategoryProperty findById(int id)
	{
		return categorypropertyRepository.findById(id).orElse(null);
	}
	public List<CategoryProperty> findAll()
	{
		return categorypropertyRepository.findAll();
	}
}