package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import app.entity.ProductProperty;

public interface ProductPropertyRepository extends JpaRepository<ProductProperty,Integer>{}