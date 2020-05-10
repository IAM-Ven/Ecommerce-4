package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import app.entity.Favorite;

public interface FavoriteRepository extends JpaRepository<Favorite,Integer>{}