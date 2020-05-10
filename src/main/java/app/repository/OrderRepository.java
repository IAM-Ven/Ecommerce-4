package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import app.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer>{}