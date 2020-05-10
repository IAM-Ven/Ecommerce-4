package app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.entity.Favorite;
import app.repository.FavoriteRepository;

@Service
public class FavoriteService
{
	@Autowired
	private FavoriteRepository favoriteRepository;
	public void save(Favorite favorite)
	{
		favoriteRepository.save(favorite);
	}
	public void update(Favorite favorite)
	{
		favoriteRepository.save(favorite);
	}
	public void deleteById(int id)
	{
		favoriteRepository.deleteById(id);
	}
	public Favorite findById(int id)
	{
		return favoriteRepository.findById(id).orElse(null);
	}
	public List<Favorite> findAll()
	{
		return favoriteRepository.findAll();
	}
}