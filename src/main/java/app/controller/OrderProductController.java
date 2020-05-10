package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import app.entity.OrderProduct;
import app.service.OrderProductService;

@RestController
@RequestMapping("/orderproduct")
public class OrderProductController
{
	@Autowired
	private OrderProductService orderproductService;
	@GetMapping
	public List<OrderProduct> findAll()
	{
		return orderproductService.findAll();
	}
	@GetMapping("/{id}")
	public OrderProduct findById(@PathVariable int id)
	{
		return orderproductService.findById(id);
	}
	@PostMapping
	public OrderProduct save(@RequestBody OrderProduct orderproduct)
	{
		orderproductService.save(orderproduct);
		return orderproduct;
	}
	@PutMapping
	public void update(@RequestBody OrderProduct orderproduct)
	{
		orderproductService.update(orderproduct);
	}
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id)
	{
		orderproductService.deleteById(id);
	}
}