package app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.entity.OrderProduct;
import app.repository.OrderProductRepository;

@Service
public class OrderProductService
{
	@Autowired
	private OrderProductRepository orderproductRepository;
	public void save(OrderProduct orderproduct)
	{
		orderproductRepository.save(orderproduct);
	}
	public void update(OrderProduct orderproduct)
	{
		orderproductRepository.save(orderproduct);
	}
	public void deleteById(int id)
	{
		orderproductRepository.deleteById(id);
	}
	public OrderProduct findById(int id)
	{
		return orderproductRepository.findById(id).orElse(null);
	}
	public List<OrderProduct> findAll()
	{
		return orderproductRepository.findAll();
	}
}