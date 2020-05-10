package app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.entity.Address;
import app.repository.AddressRepository;

@Service
public class AddressService
{
	@Autowired
	private AddressRepository addressRepository;
	public void save(Address address)
	{
		addressRepository.save(address);
	}
	public void update(Address address)
	{
		addressRepository.save(address);
	}
	public void deleteById(int id)
	{
		addressRepository.deleteById(id);
	}
	public Address findById(int id)
	{
		return addressRepository.findById(id).orElse(null);
	}
	public List<Address> findAll()
	{
		return addressRepository.findAll();
	}
}