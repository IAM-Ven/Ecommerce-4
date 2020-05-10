package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import app.entity.Color;

public interface ColorRepository extends JpaRepository<Color,Integer>{}