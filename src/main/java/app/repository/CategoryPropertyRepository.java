package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import app.entity.CategoryProperty;

public interface CategoryPropertyRepository extends JpaRepository<CategoryProperty,Integer>{}