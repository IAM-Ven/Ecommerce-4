package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import app.entity.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer>{}