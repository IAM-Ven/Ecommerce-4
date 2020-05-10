package app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.entity.Color;
import app.repository.ColorRepository;

@Service
public class ColorService
{
	@Autowired
	private ColorRepository colorRepository;
	public void save(Color color)
	{
		colorRepository.save(color);
	}
	public void update(Color color)
	{
		colorRepository.save(color);
	}
	public void deleteById(int id)
	{
		colorRepository.deleteById(id);
	}
	public Color findById(int id)
	{
		return colorRepository.findById(id).orElse(null);
	}
	public List<Color> findAll()
	{
		return colorRepository.findAll();
	}
}