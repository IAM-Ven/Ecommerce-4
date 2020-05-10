package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import app.entity.Color;
import app.service.ColorService;

@RestController
@RequestMapping("/color")
public class ColorController
{
	@Autowired
	private ColorService colorService;
	@GetMapping
	public List<Color> findAll()
	{
		return colorService.findAll();
	}
	@GetMapping("/{id}")
	public Color findById(@PathVariable int id)
	{
		return colorService.findById(id);
	}
	@PostMapping
	public Color save(@RequestBody Color color)
	{
		colorService.save(color);
		return color;
	}
	@PutMapping
	public void update(@RequestBody Color color)
	{
		colorService.update(color);
	}
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id)
	{
		colorService.deleteById(id);
	}
}