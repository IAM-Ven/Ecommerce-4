package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import app.entity.Seller;
import app.service.SellerService;

@RestController
@RequestMapping("/seller")
public class SellerController
{
	@Autowired
	private SellerService sellerService;
	@GetMapping
	public List<Seller> findAll()
	{
		return sellerService.findAll();
	}
	@GetMapping("/{id}")
	public Seller findById(@PathVariable int id)
	{
		return sellerService.findById(id);
	}
	@PostMapping
	public Seller save(@RequestBody Seller seller)
	{
		sellerService.save(seller);
		return seller;
	}
	@PutMapping
	public void update(@RequestBody Seller seller)
	{
		sellerService.update(seller);
	}
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id)
	{
		sellerService.deleteById(id);
	}
}