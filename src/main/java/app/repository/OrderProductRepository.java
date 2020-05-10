package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import app.entity.OrderProduct;

public interface OrderProductRepository extends JpaRepository<OrderProduct,Integer>{}