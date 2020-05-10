package app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.entity.Order;
import app.repository.OrderRepository;

@Service
public class OrderService
{
	@Autowired
	private OrderRepository orderRepository;
	public void save(Order order)
	{
		orderRepository.save(order);
	}
	public void update(Order order)
	{
		orderRepository.save(order);
	}
	public void deleteById(int id)
	{
		orderRepository.deleteById(id);
	}
	public Order findById(int id)
	{
		return orderRepository.findById(id).orElse(null);
	}
	public List<Order> findAll()
	{
		return orderRepository.findAll();
	}
}