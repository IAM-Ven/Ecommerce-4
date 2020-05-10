package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import app.entity.Address;
import app.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController
{
	@Autowired
	private AddressService addressService;
	@GetMapping
	public List<Address> findAll()
	{
		return addressService.findAll();
	}
	@GetMapping("/{id}")
	public Address findById(@PathVariable int id)
	{
		return addressService.findById(id);
	}
	@PostMapping
	public Address save(@RequestBody Address address)
	{
		addressService.save(address);
		return address;
	}
	@PutMapping
	public void update(@RequestBody Address address)
	{
		addressService.update(address);
	}
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id)
	{
		addressService.deleteById(id);
	}
}