package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import app.entity.Favorite;
import app.service.FavoriteService;

@RestController
@RequestMapping("/favorite")
public class FavoriteController
{
	@Autowired
	private FavoriteService favoriteService;
	@GetMapping
	public List<Favorite> findAll()
	{
		return favoriteService.findAll();
	}
	@GetMapping("/{id}")
	public Favorite findById(@PathVariable int id)
	{
		return favoriteService.findById(id);
	}
	@PostMapping
	public Favorite save(@RequestBody Favorite favorite)
	{
		favoriteService.save(favorite);
		return favorite;
	}
	@PutMapping
	public void update(@RequestBody Favorite favorite)
	{
		favoriteService.update(favorite);
	}
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id)
	{
		favoriteService.deleteById(id);
	}
}