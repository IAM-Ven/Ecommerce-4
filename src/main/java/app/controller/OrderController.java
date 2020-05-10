package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import app.entity.Order;
import app.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController
{
	@Autowired
	private OrderService orderService;
	@GetMapping
	public List<Order> findAll()
	{
		return orderService.findAll();
	}
	@GetMapping("/{id}")
	public Order findById(@PathVariable int id)
	{
		return orderService.findById(id);
	}
	@PostMapping
	public Order save(@RequestBody Order order)
	{
		orderService.save(order);
		return order;
	}
	@PutMapping
	public void update(@RequestBody Order order)
	{
		orderService.update(order);
	}
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id)
	{
		orderService.deleteById(id);
	}
}